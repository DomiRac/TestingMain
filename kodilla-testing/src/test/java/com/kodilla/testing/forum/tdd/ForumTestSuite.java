package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;


public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        ForumUser forumUser = new ForumUser("Domi", "Dominika Kowalska");

        forumUser.addPost("Hello, what's up, guys?", "Domi");

        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("Domi", "Dominika Kowalska");
        ForumPost thePost = new ForumPost("Hello, what's up, guys?", "Domi");
        forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {

        ForumUser forumUser = new ForumUser("Domi", "Dominika Raczkowska");
        ForumPost thePost = new ForumPost("Hello, what's up, guys?", "Domi");
        ForumComment theComment = new ForumComment(thePost, "Domi",
                "I'm glad that you're fine!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        ForumComment retrievedComment = forumUser.getComment(0);

        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        ForumUser forumUser = new ForumUser("Domi", "Dominika Kowalska");
        ForumPost thePost = new ForumPost("Hello, what's up, guys?", "Domi");

        boolean result = forumUser.removePost(thePost);

        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        ForumUser forumUser = new ForumUser("Domi", "Dominika Kowalska");
        ForumPost thePost = new ForumPost("Hello, what's up, guys?", "Domi");
        ForumComment theComment = new ForumComment(thePost, "I'm glad that you're fine!", "Domi");

        boolean result = forumUser.removeComment(theComment);

        Assert.assertFalse(result);
    }

}

