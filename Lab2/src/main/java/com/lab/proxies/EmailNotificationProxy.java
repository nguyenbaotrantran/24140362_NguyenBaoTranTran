package com.lab.proxies;

import com.lab.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email: " + comment.getText());
    }
}