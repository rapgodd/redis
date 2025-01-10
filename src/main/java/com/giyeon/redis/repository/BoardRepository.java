package com.giyeon.redis.repository;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.giyeon.redis.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@JsonSerialize
public interface BoardRepository extends JpaRepository<Board, Long> {
    Page<Board> findAllByOrderByCreatedAtDesc(Pageable pageable);
}