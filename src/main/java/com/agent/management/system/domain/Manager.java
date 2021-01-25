package com.agent.management.system.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Manager {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;
    @OneToMany
    private List<Team> teams;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
