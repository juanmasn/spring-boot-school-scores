package com.student.scores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.scores.data.ScoreRepository;
import com.student.scores.domain.Score;

@Controller
@RequestMapping("/students")
public class ScoreController 
{
	@Autowired
	private ScoreRepository data;

	@RequestMapping(value="/newScore.html",method=RequestMethod.POST)
	public String newVehicle(Score score)
	{
		data.save(score);
		return "redirect:/students/list.html";
	}
	
	@RequestMapping(value="/newScore.html",method=RequestMethod.GET)
	public ModelAndView renderScoreForm()
	{
		Score newScore = new Score();
		
		return new ModelAndView("newScore", "form", newScore);

	} 
	
	@RequestMapping(value="/list.html", method=RequestMethod.GET)	
	public ModelAndView scores()
	{
		List<Score> allScores = data.findAll();
		return new ModelAndView("allScores", "scores", allScores);
	}
	  
	@RequestMapping(value="/score/{name}")
	public ModelAndView showStudenScoreByName(@PathVariable("name") String name)
	{
		Score score = data.findByName(name);
		return new ModelAndView("scoreInfo", "score", score);
	}

	@RequestMapping(value="/bootstrap.html", method=RequestMethod.GET)	
	public ModelAndView bootstrap()
	{
		List<Score> allScores = data.findAll();
		return new ModelAndView("bootstrap");
	}
	
}
