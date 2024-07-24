package com.jpaonetomanymapping.service;

import com.jpaonetomanymapping.request.PostRequest;
import com.jpaonetomanymapping.response.APIResponse;
import org.springframework.http.ResponseEntity;

public interface PostService {
    ResponseEntity<APIResponse> createPost(PostRequest request);
    ResponseEntity<APIResponse> getAllPost();
}
