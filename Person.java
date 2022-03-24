public class Person {
int personID;
String name;
int companyID;
int tableID;

public Person (int id, String pname, int coID) {
	this.personID = id;
	this.name = pname;
	this.companyID = coID;

}
public String toString() {
	return ("This persons name is " + name + ", their ID is " + personID + ", their company ID is " + companyID);
}
}

public void scan()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Person's name is ");
		personName = scan.nextLine();
		System.out.println("person's ID is");
		personID = scan.nextInt();
		System.out.println("Company's ID is");
		companyID = scan.nextInt();
		
	}
	
