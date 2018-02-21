package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {


    private static ArrayList<String> getMockUserlist(int userCount){
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i<userCount;i++){
            names.add("MockUser");
        }
        return names;
    }

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("CalculateStatistics tests starting");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("CalculateStatistics tests ended");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Executing test number " + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = CalculateStatisticsTestSuite.getMockUserlist(10);
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statCalculator.getUserCount(),0);
        Assert.assertEquals(0, statCalculator.getPostCount(),0);
        Assert.assertEquals(200, statCalculator.getCommentCount(),0);
        Assert.assertEquals(0, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(200/10, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals(0, statCalculator.getAverageCommentsPerPost(), 0 );
    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = CalculateStatisticsTestSuite.getMockUserlist(10);
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statCalculator.getUserCount(),0);
        Assert.assertEquals(1000, statCalculator.getPostCount(),0);
        Assert.assertEquals(2000, statCalculator.getCommentCount(),0);
        Assert.assertEquals(1000/10, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(2000/10, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals(2000/1000, statCalculator.getAverageCommentsPerPost(), 0 );
    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = CalculateStatisticsTestSuite.getMockUserlist(10);
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statCalculator.getUserCount(),0);
        Assert.assertEquals(100, statCalculator.getPostCount(),0);
        Assert.assertEquals(0, statCalculator.getCommentCount(),0);
        Assert.assertEquals(100/10, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals(0, statCalculator.getAverageCommentsPerPost(), 0 );
    }

    @Test
    public void testCalculateAdvStatisticsWithLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = CalculateStatisticsTestSuite.getMockUserlist(10);
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(2000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statCalculator.getUserCount(),0);
        Assert.assertEquals(2000, statCalculator.getPostCount(),0);
        Assert.assertEquals(100, statCalculator.getCommentCount(),0);
        Assert.assertEquals(2000/10, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(100/10, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals((double) 100/2000, statCalculator.getAverageCommentsPerPost(), 0);
    }
    @Test
    public void testCalculateAdvStatisticsWithMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = CalculateStatisticsTestSuite.getMockUserlist(10);
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(4000);


        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statCalculator.getUserCount(), 0);
        Assert.assertEquals(1000, statCalculator.getPostCount(), 0);
        Assert.assertEquals(4000, statCalculator.getCommentCount(), 0);
        Assert.assertEquals(1000/10, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(4000/10, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals(4000/1000, statCalculator.getAverageCommentsPerPost(), 0 );
    }
    @Test
    public void testCalculateAdvStatisticsWith0Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statCalculator.getUserCount(),0);
        Assert.assertEquals(100, statCalculator.getPostCount(),0);
        Assert.assertEquals(1000, statCalculator.getCommentCount(),0);
        Assert.assertEquals(0, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(0, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals(1000/100, statCalculator.getAverageCommentsPerPost(), 0 );
    }

    @Test
    public void testCalculateAdvStatisticsWith100Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statCalculator = new CalculateStatistics();
        ArrayList<String> mockNames = CalculateStatisticsTestSuite.getMockUserlist(100);
        when(statisticsMock.usersNames()).thenReturn(mockNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50000);

        //When
        statCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statCalculator.getUserCount(),0);
        Assert.assertEquals(1000, statCalculator.getPostCount(),0);
        Assert.assertEquals(50000, statCalculator.getCommentCount(),0);
        Assert.assertEquals(1000/100, statCalculator.getAveragePostsPerUser(), 0);
        Assert.assertEquals(50000/100, statCalculator.getAverageCommentsPerUser(), 0 );
        Assert.assertEquals(50000/1000, statCalculator.getAverageCommentsPerPost(), 0 );
    }


}
