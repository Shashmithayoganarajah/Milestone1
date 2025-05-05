/*Initialize Trello
Post tweets
Get news feed (last 10 tweets)
Follow users
Unfollow users*/

import java.util.ArrayList;
import java.util.List;

class Tweet {
    int userId;
    int tweetId;
    String tweet;
    int time;

    Tweet(int userId, int tweetId, String tweet, int time) {
        this.userId = userId;
        this.tweetId = tweetId;
        this.time = time;
        this.tweet=tweet;
    }
}

public class Trello {
    private List<Tweet> tweets= new ArrayList<>();
    private List<int[]> followRelations = new ArrayList<>();
    private int timestamp =0;
    //post a tweet
    public void postTweet(int userId, String tweet ,int tweetId) {
        tweets.add(new Tweet(userId, tweetId,tweet,timestamp++));
    }

    // Get 10 most recent tweets for a user
    public List<String> getNewsFeed(int userId) {
        List<String> feed = new ArrayList<>();
        List<Integer> followees = getFollowees(userId);

        for (int i = tweets.size() - 1; i >= 0 && feed.size() < 10; i--) {
            Tweet t = tweets.get(i);
            if (t.userId == userId || followees.contains(t.userId)) {
                feed.add(String.valueOf(t.tweetId));
                feed.add(t.tweet);
            }
        }

        return feed;
    }

    // Follow another user
    public void follow(int followerId, int followeeId) {
        for (int[] pair : followRelations) {
            if (pair[0] == followerId && pair[1] == followeeId) {
                return; // already following
            }
        }
        followRelations.add(new int[]{followerId, followeeId});
    }

    // Unfollow a user
    public void unfollow(int followerId, int followeeId) {
        for (int i = 0; i < followRelations.size(); i++) {
            int[] pair = followRelations.get(i);
            if (pair[0] == followerId && pair[1] == followeeId) {
                followRelations.remove(i);
                return;
            }
        }
    }

    // Get list of followees for a user
    private List<Integer> getFollowees(int userId) {
        List<Integer> followees = new ArrayList<>();
        for (int[] pair : followRelations) {
            if (pair[0] == userId) {
                followees.add(pair[1]);
            }
        }
        return followees;
    }
}
