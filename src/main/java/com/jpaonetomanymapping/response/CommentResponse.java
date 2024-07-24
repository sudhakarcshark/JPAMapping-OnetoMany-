package com.jpaonetomanymapping.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CommentResponse {
    private Long id;
    private Long postId;
    private String comment;
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime createdDate;
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime updatedDate;
}
