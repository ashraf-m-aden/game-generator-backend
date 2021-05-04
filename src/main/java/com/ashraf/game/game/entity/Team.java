package com.ashraf.game.game.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="team")
public class Team {

	// define private fields and annotate them
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="poul")
	private int group;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY,cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="tournoi")
	private Tournoi tournoi;
	
	@JsonBackReference(value="home-team")
	@OneToMany(mappedBy="homeTeam",cascade= CascadeType.ALL)
	private List<Game> homeGames;
	
	@JsonBackReference(value="away-team")
	@OneToMany(mappedBy="awayTeam",cascade= CascadeType.ALL)
	private List<Game> awayGames;
	
	public Team() {
		
	}
	
	

	public void setId(int id) {
		this.id = id;
	}






	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public Tournoi getTournoi() {
		return tournoi;
	}

	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}

	public List<Game> getHomeGames() {
		return homeGames;
	}

	public void setHomeGames(List<Game> homeGames) {
		this.homeGames = homeGames;
	}

	public List<Game> getAwayGames() {
		return awayGames;
	}

	public void setAwayGames(List<Game> awayGames) {
		this.awayGames = awayGames;
	}





	public Team(String name, int group, Tournoi tournoi) {
		this.name = name;
		this.group = group;
		this.tournoi = tournoi;
	}





	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", group=" + group + ", tournoi=" + tournoi + "]";
	}



	
}
