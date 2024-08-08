package com.learning.backend.service;

import com.learning.backend.domain.model.dataset.JobSkill;
import com.learning.backend.domain.model.job.Job;
import com.learning.backend.domain.model.skill.Skill;
import com.learning.backend.domain.repository.JobRepository;
import com.learning.backend.domain.repository.JobSkillRepository;
import com.learning.backend.domain.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class JobService {

    private final JobRepository jobRepository;
    private final SkillRepository skillRepository;
    private final JobSkillRepository jobSkillRepository;

    public JobService(JobRepository jobRepository,
                      SkillRepository skillRepository,
                      JobSkillRepository jobSkillRepository) {
        this.jobRepository = jobRepository;
        this.skillRepository = skillRepository;
        this.jobSkillRepository = jobSkillRepository;
    }

    public String getJobDescription(long jobId) {
        Optional<Job> job = jobRepository.findById(jobId);
        return job.get().getJobDescription();
    }

    /**
     * Return REST API response that include data set of skill frequency for
     * UI bar graph generation when user search for a specific job title
     * @param keyword
     * @return List of keys and values
     */
    public List<Map<String, Object>> getJobSkillFrequency(String keyword) {
        try {
//            List<Job> jobs = jobRepository.findByTitleIgnoreCase(keyword);
            List<Job> jobs = jobRepository.findByTitleContainingIgnoreCase(keyword);
            if (jobs.isEmpty()) {
                return Collections.emptyList(); // No jobs found with the specified title
            }

            List<Integer> jobIds = jobs.stream().map(Job::getJobId).collect(Collectors.toList());
            List<JobSkill> jobSkills = jobSkillRepository.findAllByJobIdIn(jobIds);

            Map<String, Integer> skillFrequencyMap = new HashMap<>();
            for (JobSkill jobSkill : jobSkills) {
                Skill skill = skillRepository.findById(Integer.valueOf(jobSkill.getSkillId())).orElse(null);
                if (skill != null) {
                    skillFrequencyMap.put(skill.getSkillName(), skillFrequencyMap.getOrDefault(skill.getSkillName(), 0) + 1);
                }
            }

            List<Map<String, Object>> result = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : skillFrequencyMap.entrySet()) {
                Map<String, Object> skillMap = new HashMap<>();
                skillMap.put("skillName", entry.getKey());
                skillMap.put("frequency", entry.getValue());
                result.add(skillMap);
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
