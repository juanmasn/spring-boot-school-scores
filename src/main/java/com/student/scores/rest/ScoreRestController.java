package com.student.scores.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.scores.data.ScoreRepository;
import com.student.scores.domain.Score;

@RestController
@RequestMapping("/api")
public class ScoreRestController {
	
	@Autowired
	private ScoreRepository data;
	
	@RequestMapping("/scores")
	public ScoreList allScores(){
		
		List<Score> all  = data.findAll();
		return new ScoreList(all);
	}
	
	@RequestMapping(value="/scores", method=RequestMethod.POST)
	public ResponseEntity<Score> createANewScore(@RequestBody Score score){
		
		data.save(score);
		return new ResponseEntity<>(score, HttpStatus.CREATED);
	}
}
