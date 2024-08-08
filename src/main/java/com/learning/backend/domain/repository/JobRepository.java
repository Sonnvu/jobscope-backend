package com.learning.backend.domain.repository;

import com.learning.backend.domain.model.dataset.JobSkill;
import com.learning.backend.domain.model.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByTitle(String keyword);

    List<Job> findByTitleIgnoreCase(String keyword);

    List<Job> findByTitleContainingIgnoreCase(String keyword);
}
