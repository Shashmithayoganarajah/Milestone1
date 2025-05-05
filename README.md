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
