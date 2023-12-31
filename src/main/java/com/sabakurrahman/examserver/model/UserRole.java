package com.sabakurrahman.examserver.model;

import jakarta.persistence.*;

@Entity

public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Role role;

}
