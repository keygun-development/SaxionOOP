package nl.saxion.oop.week1;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }

    private ArrayList<Video> videos = new ArrayList<>();

    public void run() {
        CsvReader reader = new CsvReader("C:\\Users\\keaga\\Documents\\Saxion\\OOP\\Week1\\Exercise2\\youtubevideos.csv");
        reader.setSeparator(';');
        reader.skipRow();
        while (reader.loadRow()) {
            String youtubeId = reader.getString(0);
            String title = reader.getString(1);
            int views = reader.getInt(4);
            videos.add(new Video(youtubeId, title, views));
        }

        int menuInput;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                showWatchList();
                SaxionApp.pause();
            } else if (menuInput == 2) {
                showWatchList();
                SaxionApp.print("Please enter a video to watch: ");
                String videoId = SaxionApp.readString();
                videos.get(Integer.parseInt(videoId) - 1).watch();
                SaxionApp.printLine("You have watched:");
                SaxionApp.printLine(videos.get(Integer.parseInt(videoId) - 1).toString(), Color.YELLOW);
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
                SaxionApp.quit();
            }

        } while (menuInput != 0);
    }

    private void showWatchList() {
        for (int i = 0; i < videos.size(); i++) {
            SaxionApp.print((i + 1) + ") " + videos.get(i) + " ");
            if (videos.get(i).isWatched()) {
                SaxionApp.printLine("[WATCHED]", Color.GREEN);
            } else {
                SaxionApp.printLine("[NOT WATCHED]", Color.RED);
            }
        }
    }

}