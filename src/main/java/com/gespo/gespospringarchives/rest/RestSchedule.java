package com.gespo.gespospringarchives.rest;

import com.gespo.gespospringarchives.models.gespo.WorkSchedule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "gespo-api-rest", url = "https://www.api-rest.gespocorp.com.br")
@RequestMapping("/work-schedules")
public interface RestSchedule {

    @GetMapping("/filter")
    List<WorkSchedule> export(@RequestParam Integer projectId,
                              @RequestParam(required = false) Integer employeeId,
                              @RequestParam(required = false) String date);

}
