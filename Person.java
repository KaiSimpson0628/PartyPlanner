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
