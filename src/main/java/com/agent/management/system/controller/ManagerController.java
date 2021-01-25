package com.agent.management.system.controller;

import com.agent.management.system.domain.Manager;
import com.agent.management.system.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/manager/create-manager")
    public HashMap<String, Long> createManager(@RequestBody Manager manager) {
        HashMap<String, Long> response = this.managerService.createManager(manager);
        return response;
    }

}
