package com.learning.backend.service.utils;

import com.learning.backend.domain.model.job.Job;
import com.learning.backend.domain.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockJobGenerateService {

    private final JobRepository jobRepository;

    public MockJobGenerateService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
}
