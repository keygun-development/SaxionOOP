package nl.saxion.opp.exercise3;

public class Main {
    public static void main(String[] args) {
        User tristan = new User("T-POtje", "Tristan Pothoven");
        User evert = new User("EduudE", "Evert Duipmans");
        User ruud = new User("Greevmeister", "Ruud Greven");

        // Add some posts
        Post post1 = new Post("Currently teaching object oriented programming.");
        Post post2 = new ImagePost("Look! My cat ate my programming book :-)", "cat.jpg", "Clarendon");
        Post post3 = new VideoPost("Inheritance explained in 1 minute...", "inheritance.mp4", 60);
        tristan.addPost(post1);
        tristan.addPost(post2);
        evert.addPost(post3);

        // Add some likes
        post2.like(evert);
        post2.like(ruud);
        post3.like(tristan);
        post3.like(ruud);
        post3.like(evert);

        // Add some comments
        post2.addComment(new Comment("That's a very nice cat.", evert));
        post3.addComment(new Comment("Awesome video! I finally understand inheritance.", ruud));
        post3.addComment(new Comment("Let's add this to the materials of the course!", tristan));

        //Print
        System.out.println(tristan);
        System.out.println("------------------");
        System.out.println(evert);
        System.out.println("------------------");
        System.out.println(ruud);
    }
}
