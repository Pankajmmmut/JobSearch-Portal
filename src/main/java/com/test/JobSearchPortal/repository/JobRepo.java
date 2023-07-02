package com.test.JobSearchPortal.repository;

import com.test.JobSearchPortal.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface JobRepo extends CrudRepository<Job,Long> {

}
