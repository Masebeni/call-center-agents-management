package com.agent.management.system.repository;

import com.agent.management.system.domain.Agent;
import com.agent.management.system.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    List<Agent> findByTeam(Team team);
}
