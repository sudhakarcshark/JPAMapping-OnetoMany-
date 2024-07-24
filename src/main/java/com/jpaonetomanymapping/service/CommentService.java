package com.jpaonetomanymapping.service;

import com.jpaonetomanymapping.request.CommentRequest;
import com.jpaonetomanymapping.request.PostRequest;
import com.jpaonetomanymapping.response.APIResponse;
import com.jpaonetomanymapping.response.PostResponse;
import org.springframework.http.ResponseEntity;

public interface CommentService {
    ResponseEntity<APIResponse> addComment(CommentRequest request);
}
