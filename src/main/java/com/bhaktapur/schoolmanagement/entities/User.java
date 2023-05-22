package com.bhaktapur.schoolmanagement.entities;

import lombok.*;

import javax.persistence.*;

@Getter@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role;
    private String address;

}
