package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.model.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
