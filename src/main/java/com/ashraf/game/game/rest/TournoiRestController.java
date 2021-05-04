package com.ashraf.game.game.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashraf.game.game.entity.Tournoi;
import com.ashraf.game.game.services.TournoiServiceImpl;

@RestController
public class TournoiRestController {

	private TournoiServiceImpl tournoiServImpl;

	@Autowired
	public TournoiRestController(TournoiServiceImpl tournoiServImpl) {
		this.tournoiServImpl = tournoiServImpl;
	}
	
	@GetMapping("/tournois")
	public List<Tournoi> getAllTournoi(){
		
		return tournoiServImpl.findAll();
	}
	
	@GetMapping("/tournois/{id}")
	public Tournoi getOneTournoi(@PathVariable int id){
		
		return tournoiServImpl.findTournoi(id);
	}
	
	@PostMapping("/tournois")
	public Tournoi postOneTournoi(@RequestBody Tournoi tournoi) {
		
		return tournoiServImpl.save(tournoi);
	}
	
	
	@DeleteMapping("/tournois/{id}")
	public void removeOneTournoi(@PathVariable int id){
		
		tournoiServImpl.deleteTournoi(id);
	}
	
}
