package com.test.JobSearchPortal.service;

import com.test.JobSearchPortal.model.Job;
import com.test.JobSearchPortal.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;
    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public String addJob(Job job) {
       jobRepo.save(job);
       return "added";
    }
}
