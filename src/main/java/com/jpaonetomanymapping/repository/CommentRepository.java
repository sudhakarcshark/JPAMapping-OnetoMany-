package com.jpaonetomanymapping.repository;

import com.jpaonetomanymapping.model.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentModel,Long> {
}
