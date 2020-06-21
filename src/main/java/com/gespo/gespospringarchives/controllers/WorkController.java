package com.gespo.gespospringarchives.controllers;

import com.gespo.gespospringarchives.models.files.ScheduleFile;
import com.gespo.gespospringarchives.models.gespo.WorkSchedule;
import com.gespo.gespospringarchives.rest.RestSchedule;
import com.gespo.gespospringarchives.structures.exceptions.QueueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/schedule")
public class WorkController {

    @Autowired
    RestSchedule restSchedule;


    @GetMapping("/export")
    public ResponseEntity exportSchedules(@RequestParam Integer projectId,
                                          @RequestParam(required = false) Integer employeeId,
                                          @RequestParam(required = false) String date)
                                          throws QueueException, FileNotFoundException {

        List<WorkSchedule> workSchedules = restSchedule.export(projectId, employeeId, date);

        if (workSchedules == null) {
            return notFound().build();
        }
        else if (workSchedules.isEmpty()) {
            return noContent().build();
        }
        else{
            ScheduleFile schedulefile = new ScheduleFile(workSchedules);

            File file = schedulefile.getFile("txt");

            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

            HttpHeaders header = new HttpHeaders();
            header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=Apontamentos.txt");

            return ResponseEntity.ok().headers(header)
                                      .contentLength(file.length())
                                      .contentType(MediaType.APPLICATION_OCTET_STREAM)
                                      .body(resource);
        }
    }

}
