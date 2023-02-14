package com.cydeo.repository;

import com.cydeo.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Sending comment: "+comment.getText());

    }
}
