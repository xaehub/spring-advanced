package org.example.expert.domain.comment.dto.response;

import lombok.Getter;
import org.example.expert.domain.comment.entity.Comment;
import org.example.expert.domain.user.dto.response.UserResponse;

@Getter
public class CommentResponse {

    private final Long id;
    private final String contents;
    private final UserResponse user;

    public CommentResponse(Long id, String contents, UserResponse user) {
        this.id = id;
        this.contents = contents;
        this.user = user;
    }

    // 정적 메소드 getCommentInfo
    public static CommentResponse getCommentInfo(Comment comment) {
        return new CommentResponse(comment.getId(), comment.getContents(), new UserResponse(comment.getUser().getId(), comment.getUser().getEmail()));
    }
}
