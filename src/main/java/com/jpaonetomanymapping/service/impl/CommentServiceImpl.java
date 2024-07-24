package com.jpaonetomanymapping.service.impl;

import com.jpaonetomanymapping.constants.AppConstants;
import com.jpaonetomanymapping.mapper.AppMapper;
import com.jpaonetomanymapping.model.CommentModel;
import com.jpaonetomanymapping.repository.CommentRepository;
import com.jpaonetomanymapping.request.CommentRequest;
import com.jpaonetomanymapping.response.APIResponse;
import com.jpaonetomanymapping.response.CommentResponse;
import com.jpaonetomanymapping.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public ResponseEntity<APIResponse> addComment(CommentRequest request) {
        CommentModel model = commentRepository.save(AppMapper.requestToCommentMapper(request));
        return ResponseEntity.ok(
                APIResponse.builder()
                        .errorCode(AppConstants.SUCCESS_CODE)
                        .errorMessage(AppConstants.SUCCESSFULLY_STORED)
                        .data(CommentResponse.builder()
                                .id(model.getId())
                                .postId(model.getPostId())
                                .comment(model.getComment())
                                .createdDate(model.getCreatedDate())
                                .updatedDate(model.getUpdatedDate())
                                .build())
                        .build()
        );
    }
}
