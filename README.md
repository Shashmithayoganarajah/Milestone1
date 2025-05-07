Overview

Design a simplified version of a social media platform named Trello, where users can:
Post messages (referred to as "trello tweets").


Follow or unfollow other users.


View the 10 most recent messages in their news feed.​


Objectives
Implement the Trello class with the following functionalities:
Trello()
 Initializes the Trello object.


void postTweet(int userId, int tweetId)
 Allows a user with ID userId to post a new message with ID tweetId.


List<Integer> getNewsFeed(int userId)
 Retrieves the 10 most recent message IDs in the user's news feed. Each item in the news feed must be posted by users whom the user follows or by the user themselves. Messages must be ordered from most recent to least recent.


void follow(int followerId, int followeeId)
 Enables the user with ID followerId to follow the user with ID followeeId.


void unfollow(int followerId, int followeeId)
 Enables the user with ID followerId to unfollow the user with ID followeeId.
 

The Main class is the program's entry point. It shows the Trello class's basic functionality by posting tweets from various users, an unfollow/follow action, and fetching the news feed of a user prior to and after unfollowing another user.
The Trello class mimics a light implementation of a social media site (such as Twitter). It tracks user tweets and follow relationships so that users can post tweets, follow or unfollow other users, and return a news feed of the 10 most recent tweets of the user and followees.
Tweets are contained in a list, with ordering by posting accomplished using a timestamp.
Follow relationships are maintained as a list of integer arrays, each for a followee-follower pair.
The news stream is created by feeding the most recent tweets from the user or those they are following, and retrieving a maximum of 10 in reverse chronological order.
The Tweet class is a minimal data model of a single tweet. Every tweet is saved with the author user ID, a tweet ID, the message of the tweet, and a timestamp for when it was posted compared to others. This timestamp is utilized to sort tweets when creating a news feed.
