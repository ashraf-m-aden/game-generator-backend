package com.ashraf.game.game.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashraf.game.game.entity.Tournoi;
import com.ashraf.game.game.repository.TournoiRepository;

@Service
public class TournoiServiceImpl implements TournoiService {
	
	@Autowired
	private TournoiRepository tournoiRepo;
	

	@Override
	@Transactional
	public List<Tournoi> findAll() {
	
		return tournoiRepo.findAll();
		
	}

	@Override
	@Transactional
	public Tournoi save(Tournoi team) {
		
		return tournoiRepo.save(team);
	}

	@Override
	@Transactional
	public Tournoi findTournoi(int id) {
		Optional<Tournoi> result = tournoiRepo.findById(id);
		Tournoi tournoi = null;
		if(result.isPresent()) {
			tournoi = result.get();
		} else {
			throw new RuntimeException("Did not find tournoi id "+id);
		}
		return tournoi;
	}

	@Override
	@Transactional
	public String deleteTournoi(int id) {

		tournoiRepo.deleteById(id);
		return "Team deleted";
	}

}
