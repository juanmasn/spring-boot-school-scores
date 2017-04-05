package com.student.scores.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.scores.domain.Score;

public interface ScoreRepository extends JpaRepository<Score, Long>{

	public Score findByName(String name);

}
