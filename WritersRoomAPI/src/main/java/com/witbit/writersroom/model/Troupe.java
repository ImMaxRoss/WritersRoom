package com.witbit.writersroom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Troupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    @JsonIgnore
    private User createdBy;

    @Column(nullable = false)
    private Boolean isPublic = false;

    // Relationships

    // Members of the troupe
    @OneToMany(mappedBy = "troupe", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TroupeMember> members = new HashSet<>();

    // Meetings associated with this troupe
    @OneToMany(mappedBy = "troupe", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Meeting> meetings = new HashSet<>();

    // Additional fields and methods as needed

}