package com.ashraf.game.game.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashraf.game.game.entity.Team;
import com.ashraf.game.game.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamRepository teamRepo;
	

	@Override
	@Transactional
	public List<Team> findAll() {
	
		return teamRepo.findAll();
		
	}

	@Override
	@Transactional
	public Team save(Team team) {
		
		return teamRepo.save(team);
	}

	@Override
	@Transactional
	public Team findTeam(int id) {
		Optional<Team> result = teamRepo.findById(id);
		Team team = null;
		if(result.isPresent()) {
			team = result.get();
		} else {
			throw new RuntimeException("Did not find book id "+id);
		}
		return team;
	}

	@Override
	@Transactional
	public String deleteTeam(int id) {

		teamRepo.deleteById(id);
		return "Team deleted";
	}

}
