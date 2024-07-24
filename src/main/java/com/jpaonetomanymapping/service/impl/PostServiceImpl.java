package com.jpaonetomanymapping.service.impl;

import com.jpaonetomanymapping.constants.AppConstants;
import com.jpaonetomanymapping.mapper.AppMapper;
import com.jpaonetomanymapping.model.PostModel;
import com.jpaonetomanymapping.repository.PostRepository;
import com.jpaonetomanymapping.request.PostRequest;
import com.jpaonetomanymapping.response.APIResponse;
import com.jpaonetomanymapping.response.PostResponse;
import com.jpaonetomanymapping.service.PostService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.AnnotatedParameterizedType;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public ResponseEntity<APIResponse> createPost(PostRequest request) {

        PostModel model = postRepository.save(AppMapper.requestToMapper(request));
        return ResponseEntity.ok(
                APIResponse.builder()
                        .errorCode(AppConstants.SUCCESS_CODE)
                        .errorMessage(AppConstants.SUCCESSFULLY_STORED)
                        .data(PostResponse.builder()
                                .id(model.getId())
                                .title(model.getTitle())
                                .description(model.getDescription())
                                .createdDate(model.getCreatedDate())
                                .updatedDate(model.getUpdatedDate())
                                .build())
                        .build()
        );

    }
    public ResponseEntity<APIResponse> getAllPost(){
        return ResponseEntity.ok(
                APIResponse.builder()
                        .errorCode(AppConstants.SUCCESS_CODE)
                        .errorMessage(AppConstants.SUCCESSFULLY_RETRIEVED)
                        .data(postRepository.findAll().stream()
                                .map(model -> AppMapper.modelToPostResponseMapper(model))
                                .collect(Collectors.toSet()))
                        .build()
        );
    }
}
