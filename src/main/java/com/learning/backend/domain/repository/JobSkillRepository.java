package com.learning.backend.domain.repository;

import com.learning.backend.domain.model.dataset.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSkillRepository extends JpaRepository<JobSkill, Integer> {
    List<JobSkill> findAllByJobIdIn(List<Integer> jobIds);
}
