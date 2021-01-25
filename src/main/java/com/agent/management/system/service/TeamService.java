package com.agent.management.system.service;

import com.agent.management.system.domain.Team;

import java.util.HashMap;
import java.util.List;

public interface TeamService {
    List<Team> fetchAllTeams();
    Team fetchSpecificTeam(Long teamId);
    HashMap<String, Long> createTeam(Team team);
    List<Team> fetchEmptyTeams();
}
