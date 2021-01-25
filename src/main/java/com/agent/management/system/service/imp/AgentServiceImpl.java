package com.agent.management.system.service.imp;

import com.agent.management.system.domain.Agent;
import com.agent.management.system.domain.Team;
import com.agent.management.system.repository.AgentRepository;
import com.agent.management.system.repository.TeamRepository;
import com.agent.management.system.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public abstract class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Agent> fetchAllAgents() {
        List<Agent> agents = this.agentRepository.findAll();
        return agents;
    }

    @Override
    public Agent fetchSpecificAgent(Long agentId) {
        Optional<Agent> agent = this.agentRepository.findById(agentId);
        return agent.get();
    }

    @Override
    public HashMap<String, Long> createAgent(Agent agent) {
        HashMap<String, Long> response = new HashMap<>();
        Agent savedAgent = this.agentRepository.save(agent);
        response.put("agentId", savedAgent.getId());
        return response;
    }

    @Override
    public HashMap<String, String> updateAgentTeam(Long teamId, Agent agent) {
        HashMap<String, String> response = new HashMap<>();
        Optional<Team> optionalTeam = this.teamRepository.findById(teamId);

        if(optionalTeam.isPresent()) {
            agent.setTeam(optionalTeam.get());
            this.agentRepository.save(agent);
            response.put("message", "Updated successfully");
        } else { response.put("message", "Failed"); }

        return response;
    }
}
