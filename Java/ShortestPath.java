// Given a route containing 4 directions (N,E,W,S), find the shortest path to reach the destination 

import java.util.Scanner;

public class ShortestPath {
    public static void shortestpath(String direction) {
        int x = 0, y = 0;
        for (int i = 0; i < direction.length(); i++) {
            char next_dir = direction.charAt(i);
            if (next_dir == 'N') {
                y++;
            } else if (next_dir == 'E') {
                x++;
            } else if (next_dir == 'S') {
                y--;
            } else {
                x--;
            }
        }
        double shortest_path = Math.sqrt((x * x + y * y));
        System.out.println("Final position of the person is: " + x + " " + y);
        System.out.println("Shortest Path: " + shortest_path);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directions to be followed: ");
        String direction = sc.next();
        shortestpath(direction);
        sc.close();

    }

}
