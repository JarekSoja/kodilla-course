package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;
import java.util.*;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args){
        Forum forum = new Forum();
        Map<Integer, ForumUser> filteredForumUsers = forum.getBookList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1998)
                .filter(forumUser -> forumUser.getPostsPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("There are " + filteredForumUsers.size() + " filtered forum users.\n Their data: " );
        filteredForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue() + "\n")
                .forEach(System.out::println);
    }
}