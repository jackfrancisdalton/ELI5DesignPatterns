package behavioural.observer.real;

/**
 * Created by jackfrancisdalton on 14/04/17.
 */
public class Main {
    public static void main(String[] args) {
        User jack = new User("JackFrancisDalton");
        User jessie = new User("JessieJay");
        User alison = new User("AlisonMorse");
        User theo = new User("TheoBarfoot");

        Post firstPost = jack.createPost("Hello World");
        firstPost.follow(jessie);
        firstPost.follow(alison);
        firstPost.setContent("Hello Universe!");

        firstPost.unfollow(jessie);
        firstPost.unfollow(alison);
        firstPost.follow(theo);
        firstPost.setContent("Hello Multiverse!");
    }
}
