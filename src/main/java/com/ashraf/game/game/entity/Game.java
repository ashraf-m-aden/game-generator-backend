package com.ashraf.game.game.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Game {
	

	// define private fields and annotate them
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="hometeam")
	private Team homeTeam;
	
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="awayteam")
	private Team awayTeam;
	
	@JsonBackReference(value="tournoi")
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="tournoi")
	private Tournoi tournoi;
	
	@Column(name = "schedule")
	private String schedule;
	
	@Column(name = "score")
	private String score;
	
	@Column(name = "poul")
	private int groupe;


	public Game(Team homeTeam, Team awayTeam, Tournoi tournoi, String schedule, String score, int groupe) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.tournoi = tournoi;
		this.schedule = schedule;
		this.score = score;
		this.groupe = groupe;
	}

	public Game() {
	}

	
	public Tournoi getTournoi() {
		return tournoi;
	}

	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}

	public int getGroupe() {
		return groupe;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
	

}
