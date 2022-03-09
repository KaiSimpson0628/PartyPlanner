import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Banquet {
	
public static void main(String[] args) {
	
	ArrayList<String> people = new ArrayList<String>();
try {
File myObj = new File("names.csv");
Scanner scan = new Scanner(myObj);
for (int i = 0; i<90; i++) 
{
	String whatever = scan.nextLine();
	int personID = Integer.valueOf(whatever.substring(0,1));
	people.add(whatever);
	System.out.println(people);
	System.out.println(personID);
}
	}
catch (FileNotFoundException e) {
System.out.println("error");
e.printStackTrace();
}

int numPPL;
int[][] pplfrCo = new int[16][20];
Person[][] bt = new Person[10][10];
Person p1 = new Person(3, "Kai",  13);
System.out.println(p1);
Person p2 = new Person(5, "John",  18);
System.out.println(p2);
Person p3 = new Person(8, "Felix",  8);
System.out.println(p3);
Person p4 = new Person(2, "Abigail",  10);
System.out.println(p4);
Person p5 = new Person(7, "Neel",  15);
System.out.println(p5);
Person p6 = new Person(6, "Will",  7);
System.out.println(p6);
Person p7 = new Person(1, "Max",  2);
System.out.println(p7);
Person p8 = new Person(4, "Jerry",  4);
System.out.println(p8);
Person p9 = new Person(9, "Jofree",  12);
System.out.println(p9);
Person p10 = new Person(10, "Marcus",  3);
System.out.println(p10);

}
}
