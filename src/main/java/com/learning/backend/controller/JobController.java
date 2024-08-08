package com.learning.backend.controller;

import com.learning.backend.service.JobService;
import com.learning.backend.service.ProxyCurlRequestService;
import com.learning.backend.service.RequestService;
import com.learning.backend.worker.dataPopulation.parser.SimpleSkillParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JobController {

    private final JobService jobService;
    private final RequestService requestService;
    private final ProxyCurlRequestService proxyCurlRequestService;
    private final SimpleSkillParser simpleSkillParser;

    public JobController(JobService jobService,
                         RequestService requestService,
                         ProxyCurlRequestService proxyCurlRequestService,
                         SimpleSkillParser simpleSkillParser) {
        this.jobService = jobService;
        this.requestService = requestService;
        this.proxyCurlRequestService = proxyCurlRequestService;
        this.simpleSkillParser = simpleSkillParser;
    }

    @GetMapping("/job/description/{jobId}")
    public String getJobDescription(@PathVariable long jobId) {
        return jobService.getJobDescription(jobId);
    }

    // Exploratory Implementation to get Job Posting datas
    @GetMapping("/explore/getAll/{keyword}")
    public String getJobPosting(@PathVariable String keyword) {
        return proxyCurlRequestService.getAllJobPostings(keyword);
    }

    @GetMapping("/explore/nextPage")
    public String getJobListingNextPage() {
        return proxyCurlRequestService.getJobListingNextPage();
    }

    // Core Functionalities Prototype
    @GetMapping("/explore/{keyword}")
    public List<Map<String, Object>> getJobFrequencyData(@PathVariable String keyword) {
        return jobService.getJobSkillFrequency(keyword);
    }

    // TEST: NLP Model
    @GetMapping("/nlp")
    public void ParseSkill() throws IOException {
        simpleSkillParser.SimplerOpenNLPTest();
    }
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
