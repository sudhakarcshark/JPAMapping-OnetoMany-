package com.jpaonetomanymapping.controller;

import com.jpaonetomanymapping.request.PostRequest;
import com.jpaonetomanymapping.response.APIResponse;
import com.jpaonetomanymapping.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    @PostMapping("/create")
    public ResponseEntity<APIResponse> createPost(@RequestBody PostRequest request){
        return service.createPost(request);
    }

    @GetMapping("/getPosts")
    public ResponseEntity<APIResponse> getAllPost(){
        return service.getAllPost();
    }
}
