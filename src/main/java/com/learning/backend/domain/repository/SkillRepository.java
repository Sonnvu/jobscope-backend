package com.learning.backend.domain.repository;

import com.learning.backend.domain.model.skill.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
