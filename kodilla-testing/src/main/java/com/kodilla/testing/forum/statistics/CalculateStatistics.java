package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    Statistics statistics;
    private double userCount;
    private double postCount;
    private double commentCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.userCount = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.commentCount = statistics.commentsCount();
        if (this.userCount != 0) {
            this.averagePostsPerUser = this.postCount / this.userCount;
        } else this.averagePostsPerUser = 0;
        if (this.userCount != 0) {
            this.averageCommentsPerUser = this.commentCount / this.userCount;
        } else this.averageCommentsPerUser = 0;
     if (this.commentCount != 0 && this.postCount != 0) {
       this.averageCommentsPerPost = this.commentCount / this.postCount;
      } else this.averageCommentsPerPost = 0;

    }

    public void showStatistics(){
        System.out.println("There are " + this.userCount + " users registered.");
        System.out.println("The users have written " + this.postCount + " posts so far.");
        System.out.println("The users have written " + this.commentCount + " comments so far.");
        System.out.println("Average user has written " + this.averagePostsPerUser + " posts.");
        System.out.println("Average user has written " + this.averageCommentsPerUser + " comments.");
        System.out.println("Average post has " + this.averageCommentsPerPost + " comments.");
    }

    public double getUserCount() {
        return userCount;
    }

    public double getPostCount() {
        return postCount;
    }

    public double getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
