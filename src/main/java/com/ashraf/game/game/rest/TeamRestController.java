package com.ashraf.game.game.rest;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashraf.game.game.entity.Team;
import com.ashraf.game.game.entity.Tournoi;
import com.ashraf.game.game.services.TeamServiceImpl;
import com.ashraf.game.game.services.TournoiServiceImpl;

@RestController
public class TeamRestController {

	private TeamServiceImpl teamServImpl;
	private TournoiServiceImpl tournoiServImpl;

	@Autowired
	public TeamRestController(TeamServiceImpl teamServImpl,TournoiServiceImpl tournoiServImpl) {
		this.teamServImpl = teamServImpl;
		this.tournoiServImpl = tournoiServImpl;
	}
	
	@GetMapping("/teams")
	public List<Team> getAllTeam(){
		
		return teamServImpl.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getOneTeam(@PathVariable int id){
		
		return teamServImpl.findTeam(id);
	}
	
	@PostMapping("/teams")
	public Team postOneTeam(@RequestBody Team team) {
		Logger log = Logger.getLogger(TeamRestController.class);
		return teamServImpl.save(team);
	}
}
