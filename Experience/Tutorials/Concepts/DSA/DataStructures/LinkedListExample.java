package Experience.Tutorials.Concepts.DSA.DataStructures;


import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Theoretical Explanation: LinkedList is a linear data structure where elements are stored in nodes that have references to the next node.
        
        // Contextual Explanation: Let's use a LinkedList to simulate a playlist of songs.
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");
        
        // Displaying the playlist
        System.out.println("Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}