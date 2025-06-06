package com.example.demo.Repository;

import com.example.demo.Model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    List<Reply> findByCommentId(Long commentId);
}
