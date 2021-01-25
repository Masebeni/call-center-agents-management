package com.agent.management.system.service.imp;

import com.agent.management.system.domain.Manager;
import com.agent.management.system.repository.ManagerRepository;
import com.agent.management.system.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public HashMap<String, Long> createManager(Manager manager) {
        HashMap<String, Long> response = new HashMap<>();
        Manager savedManager = this.managerRepository.save(manager);

        response.put("agentId", savedManager.getId());

        return response;
    }
}
