package com.witbit.writersroom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2000)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    @JsonIgnore // Hide author until after voting
    private User author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meeting_id", nullable = false)
    @JsonIgnore
    private Meeting meeting;

    @Column(nullable = false)
    private Boolean isSelected = false;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    // Relationships

    // Votes on this idea
    @OneToMany(mappedBy = "idea", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<IdeaVote> votes = new HashSet<>();

    // Replies to this idea
    @OneToMany(mappedBy = "idea", cascade = CascadeType.ALL)
    private Set<IdeaReply> replies = new HashSet<>();

    // EditMeeting associated with this idea, if selected
    @OneToOne(mappedBy = "idea", cascade = CascadeType.ALL)
    @JsonIgnore
    private EditMeeting editMeeting;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }


}