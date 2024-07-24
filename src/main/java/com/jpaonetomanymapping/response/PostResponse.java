package com.jpaonetomanymapping.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jpaonetomanymapping.model.CommentModel;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class PostResponse {
    private Long id;
    private String title;
    private String description;
    private Set<CommentResponse> comment = new HashSet<>();
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime createdDate;
    @JsonFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime updatedDate;
}
