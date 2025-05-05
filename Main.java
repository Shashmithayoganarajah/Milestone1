public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();

        trello.postTweet(1,"hello", 101);
        trello.postTweet(2, "Genspark 2025",102);
        trello.postTweet(1,"Hi", 103);
        trello.postTweet(3, "Welcome", 104);

        trello.follow(1, 2);

        System.out.println(trello.getNewsFeed(1));

        trello.unfollow(1, 2);

        System.out.println(trello.getNewsFeed(1));
    }
}
