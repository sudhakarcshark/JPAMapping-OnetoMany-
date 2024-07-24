package com.jpaonetomanymapping.controller;

import com.jpaonetomanymapping.request.CommentRequest;
import com.jpaonetomanymapping.response.APIResponse;
import com.jpaonetomanymapping.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer/comment")
@RequiredArgsConstructor
public class addComment {

    private final CommentService service;

    @PostMapping("/create")
    public ResponseEntity<APIResponse> addComment(@RequestBody CommentRequest request){

       return service.addComment(request);
    }
}
