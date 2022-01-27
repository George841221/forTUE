package com.forTUE.SwimmingRaceRegistrationManagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(length = 100, nullable = false)
    private String fullName;
    @Column(length = 100, unique = true, nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Email
    @Column(nullable = false)
    private String eMail;
    @Column(nullable = false)
    private String telNum;
    private boolean enabled = false;
    private boolean locked = false;



}
