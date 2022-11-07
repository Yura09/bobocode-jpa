package com.example.bobocodejpa.entity;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoteDTO {
    private Long id;

    private String body;
}
