package com.test.JobSearchPortal.controller;

import com.test.JobSearchPortal.model.Job;
import com.test.JobSearchPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    //find all job
    @GetMapping("jobs")
    public Iterable<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    //add one job
    @PostMapping(value = "job")
    public String addJob(@RequestBody Job job){
        return jobService.addJob(job);
    }
}
