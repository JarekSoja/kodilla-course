package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials john = new Millenials("John Smith");
        YGeneration debbie = new YGeneration("Debbie Harry");
        ZGeneration martha = new ZGeneration("Martha Steward");

        //When
        String johnIsPublishing = john.sharePost();
        System.out.println("John is " + johnIsPublishing);
        String debbieIsPublishing = debbie.sharePost();
        System.out.println("Debbie is " + debbieIsPublishing);
        String marthaIsPublishing = martha.sharePost();
        System.out.println("Martha is " + marthaIsPublishing);

        //Then
        Assert.assertEquals("Sharing on Facebook", johnIsPublishing);
        Assert.assertEquals("Sharing on Twitter", debbieIsPublishing);
        Assert.assertEquals("Sharing on Snapchat", marthaIsPublishing);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials john = new Millenials("John Smith");

        //When
        String johnIsPublishing = john.sharePost();
        System.out.println("John is " + johnIsPublishing);
        john.setSocialMedium(new TwitterPublisher());
        johnIsPublishing = john.sharePost();
        System.out.println("John is " + johnIsPublishing);

        //Then
        Assert.assertEquals("Sharing on Twitter", johnIsPublishing);
    }
}
