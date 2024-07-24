package com.jpaonetomanymapping.mapper;

import com.jpaonetomanymapping.model.CommentModel;
import com.jpaonetomanymapping.model.PostModel;
import com.jpaonetomanymapping.request.CommentRequest;
import com.jpaonetomanymapping.request.PostRequest;
import com.jpaonetomanymapping.response.CommentResponse;
import com.jpaonetomanymapping.response.PostResponse;

import java.util.Set;
import java.util.stream.Collectors;

public class AppMapper {
    public static PostModel requestToMapper(PostRequest request){
        return PostModel.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .build();
    }

    public static CommentModel requestToCommentMapper(CommentRequest request){
        return CommentModel.builder()
                .postId(request.getPostId())
                .comment(request.getComment())
                .build();
    }

    public static PostResponse modelToPostResponseMapper(PostModel model){

        return PostResponse.builder()
                .id(model.getId())
                .title(model.getTitle())
                .comment(commentsResponseMapper(model.getComment()))
                .description(model.getDescription())
                .createdDate(model.getCreatedDate())
                .updatedDate(model.getUpdatedDate())
                .build();
    }

    private static Set<CommentResponse> commentsResponseMapper (Set<CommentModel> models){

        return models.stream().map(model -> CommentResponse.builder()
                .id(model.getId())
                .postId(model.getPostId())
                .comment(model.getComment())
                .createdDate(model.getCreatedDate())
                .updatedDate(model.getUpdatedDate())
                .build())
                .collect(Collectors.toSet());
    }
}
