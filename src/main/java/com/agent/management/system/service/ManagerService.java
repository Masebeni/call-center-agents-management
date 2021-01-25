package com.agent.management.system.service;

import com.agent.management.system.domain.Manager;
import java.util.HashMap;

public interface ManagerService {
    HashMap<String, Long> createManager(Manager manager);
}
