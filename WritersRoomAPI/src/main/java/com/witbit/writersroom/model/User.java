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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(length = 500)
    private String profileDescription;

    // Relationships

    // User's memberships in troupes
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TroupeMember> troupeMemberships = new HashSet<>();

    // User's participation in meetings
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<MeetingMember> meetingMemberships = new HashSet<>();

    // User's submitted ideas
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Idea> ideas = new HashSet<>();

    // User's votes on ideas
    @OneToMany(mappedBy = "voter", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<IdeaVote> ideaVotes = new HashSet<>();

    // User's replies to ideas
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<IdeaReply> ideaReplies = new HashSet<>();

    // User's created meetings
    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Meeting> createdMeetings = new HashSet<>();

    // User's created troupes
    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Troupe> createdTroupes = new HashSet<>();

}