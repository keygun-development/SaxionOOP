package nl.saxion.oop.week1;

public class Video {
    private String youtubeId;
    private String title;
    private int views;
    private boolean watched;

    public Video(String youtubeId, String title, int views) {
        this.youtubeId = youtubeId;
        this.title = title;
        this.views = views;
        this.watched = false;
    }

    public void watch()
    {
        this.watched = true;
    }

    public boolean isWatched()
    {
        return this.watched;
    }

    @Override
    public String toString() {
        return title+" - "+youtubeId+" "+"("+views+" views)";
    }
}
