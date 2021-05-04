package com.ashraf.game.game.services;

import java.util.List;

import com.ashraf.game.game.entity.Tournoi;



public interface TournoiService {

	public List<Tournoi> findAll();
	public Tournoi save(Tournoi tournoi);
	public Tournoi findTournoi(int id);
	public String deleteTournoi(int id);
}
