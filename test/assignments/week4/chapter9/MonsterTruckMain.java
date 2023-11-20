package assignments.week4.chapter9;

/*
--Exercise 4--
Write a class MonsterTruck that relates to the Car and Truck classes from Self-Check Problems 9 and 10 and whose methods
have the following behavior. Whenever possible, use inheritance to reuse behavior from the superclasses.

Method	    Output/Return
m1          monster 1
m2	        truck 1
            car 1
toString	"monster vroomvroom"
*/

public class MonsterTruckMain {
    public static void main(String[] args) {
        MonsterTruck monsterTruck = new MonsterTruck();
        monsterTruck.m1();
        monsterTruck.m2();
        System.out.println(monsterTruck);
    }
}
