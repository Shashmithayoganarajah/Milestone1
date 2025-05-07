public class Tweet {
    int userId;
    int tweetId;
    String tweet;
    int time;

    Tweet(int userId, int tweetId, String tweet, int time)
    {
        this.userId = userId;
        this.tweetId = tweetId;
        this.time = time;
        this.tweet=tweet;
    }
}
