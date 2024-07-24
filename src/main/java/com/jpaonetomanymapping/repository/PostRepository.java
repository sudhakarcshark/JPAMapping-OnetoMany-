package com.jpaonetomanymapping.repository;

import com.jpaonetomanymapping.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostModel,Long> {
}
