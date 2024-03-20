package nl.saxion.opp.exercise3;

public class VideoPost extends Post {
    private String filename;
    private int length;

    public VideoPost(String description, String filename, int length) {
        super(description);
        this.filename = filename;
        this.length = length;
    }

    public String getFilename() {
        return filename;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return getClass().getSimpleName() + " on " + super.toString() + "Image: " + filename + " (" + length + "sec)";
    }
}
