package com.ashraf.game.game.entity;

import java.util.ArrayList;
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

import org.jboss.logging.Logger;

import com.ashraf.game.game.rest.TeamRestController;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tournoi")
public class Tournoi {

	// define private fields and annotate them
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "pouls")
	private int groups;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "tournoi", cascade= {CascadeType.MERGE,CascadeType.REMOVE})
	private List<Team> teams;
	
	@JsonManagedReference(value="tournoi")
	@OneToMany(mappedBy = "tournoi", cascade=CascadeType.ALL)
	private List<Game> games;

	public Tournoi() {
	}


	public Tournoi(String name, int groups, List<Team> teams) {
		this.name = name;
		this.groups = groups;
		this.teams = teams;
	}


	public int getGroups() {
		return groups;
	}


	public void setGroups(int groups) {
		this.groups = groups;
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

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}




}
