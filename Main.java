public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();

        trello.postTweet(1, 101);
        trello.postTweet(2, 102);

        trello.follow(1, 2);

        System.out.println(trello.getNewsFeed(1));

        trello.unfollow(1, 2);

        System.out.println(trello.getNewsFeed(1));
    }
}
