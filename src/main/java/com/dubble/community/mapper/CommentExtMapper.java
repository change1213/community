package com.dubble.community.mapper;


import com.dubble.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}