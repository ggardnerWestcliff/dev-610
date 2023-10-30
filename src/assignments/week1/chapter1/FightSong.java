package assignments.week1.chapter1;

/*
--Exercise 12--

Write a program called FightSong that produces this output.
Use at least two static methods to show structure and eliminate redundancy in your solution.

Go, team, go!
You can do it.

Go, team, go!
You can do it.
You're the best,
In the West.
Go, team, go!
You can do it.

Go, team, go!
You can do it.
You're the best,
in the West.
Go, team, go!
You can do it.

Go, team, go!
You can do it.

*/

public class FightSong {
    public static void main(String[] args) {
        writeGoTeamGo();
        System.out.println();
        writeChorus();
        System.out.println();
        writeChorus();
        System.out.println();
        writeGoTeamGo();

    }

    public static void writeChorus() {
        writeGoTeamGo();
        writeBestInWest();
        writeGoTeamGo();
    }

    public static void writeGoTeamGo() {
        System.out.println("Go, team, go!\nYou can do it.");
    }

    public static void writeBestInWest() {
        System.out.println("You're the best,\nIn the West.");
    }
}
