
package com.example.bobocodejpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
import javax.persistence.*;

@Entity
@Table(name = "notes")
*/
 @NoArgsConstructor
 @AllArgsConstructor
 @Getter
 @Builder
public class Note {
   // @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    //@Column(nullable = false)
    private String body;

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "person_id")
    //private Person person;
}

