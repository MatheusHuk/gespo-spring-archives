package com.gespo.gespospringarchives.models.files;

import com.gespo.gespospringarchives.models.gespo.WorkSchedule;
import com.gespo.gespospringarchives.structures.Queue;
import com.gespo.gespospringarchives.structures.exceptions.QueueException;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import static com.gespo.gespospringarchives.patterns.DataPattern.convertHoursToString;
import static com.gespo.gespospringarchives.patterns.DataPattern.convertToDataPatern;

public class ScheduleFile {

    public String header;
    public String body;
    public String trailer;

    public ScheduleFile(@NotNull List<WorkSchedule> schedules) throws QueueException {

        header = "";
        body = "";
        trailer = "";

        Queue<WorkSchedule> queue = new Queue(
                schedules.size()
        );

        for (WorkSchedule schedule : schedules)
            queue.insert(schedule);

        WorkSchedule first = queue.peek();
        int cont = 0;

        // Criando ARQUIVO

        header += "00"; // Registro Header: “00”
        header += "apontamento"; // Arquivo de apontamento: “apontamento”
        header += String.format("%-25s", first.getProject().getName()); // Indica o nome projeto do apontamento
        header += String.format("%-30s", first.getProject().getManager()); //Indica o nome do Gerente do projeto
        header += convertToDataPatern(first.getCreationDate(), "yyyy-MM-dd"); // Data da geração do arquivo no formato: “yyyy-MM-dd”
        header += "1.00"; // Número da versão do layout para controle Ex: 1.00
        header += "\n";

        while(!queue.isEmpty()) {

            WorkSchedule next = queue.poll();

            body += "01"; // Registro Body: “01”
            body += String.format("%-30s", next.getEmployee().getName()); // Nome do funcionário
            body += String.format("%-100s", next.getDsWork()); // Alguma observação sobre o apontamento
            body += convertHoursToString(next.getAmountHours()); // Total de horas apontadas no formato: “HH:mm”
            body += "\n";

            cont++;
        }

        trailer += "02"; // Registro de trailer: “02”
        trailer += cont; // Quantidade de dados em layout

    }

    public String getContent() {
        return header + body + trailer;
    }

    public File getFile (String extension){

        File file = null;
        PrintWriter printWriter = null;

        try {
            file = new File("Apontamentos.txt");
            printWriter = new PrintWriter(file);
            printWriter.write(this.getContent());
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        finally {
            printWriter.flush();
            printWriter.close();
        }

        return file;
    }

}
