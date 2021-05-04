package com.ashraf.game.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashraf.game.game.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
