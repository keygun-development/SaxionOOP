package nl.saxion.opp.exercise3;

public class ImagePost extends Post {
    private String filename;
    private String filter;

    public ImagePost(String description, String filename, String filter) {
        super(description);
        this.filename = filename;
        this.filter = filter;
    }

    public String getFilename() {
        return filename;
    }

    public String getFilter() {
        return filter;
    }

    public String toString() {
        return getClass().getSimpleName() + " on " + super.toString() + "Image: " + filename + " (Filter: " + filter + ")";
    }
}
