package com.jpaonetomanymapping.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CommentRequest {

    private Long postId;
    private String comment;
}
