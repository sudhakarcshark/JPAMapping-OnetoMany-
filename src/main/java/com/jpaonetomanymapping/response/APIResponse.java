package com.jpaonetomanymapping.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class APIResponse {
    private int errorCode;
    private String errorMessage;
    private Object data;
}
