package com.student.scores.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.student.scores.domain.Score;

@XmlRootElement(name="scores")
public class ScoreList {
	
	private List<Score> scores;
	
	public ScoreList() {}
	
	public ScoreList(List<Score> scores){
		this.scores = scores;
	}

	@XmlElement(name="score")
	public List<Score> getScores() {
		return scores;
	}

	public void setVehicles(List<Score> scores) {
		this.scores = scores;
	}
	
	

}
