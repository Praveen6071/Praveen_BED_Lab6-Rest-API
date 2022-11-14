package com.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "roles")
@Data
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;
  
     
    
}
