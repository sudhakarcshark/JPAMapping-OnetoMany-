package com.jpaonetomanymapping.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class PostRequest {
    private String title;
    private String description;
}
