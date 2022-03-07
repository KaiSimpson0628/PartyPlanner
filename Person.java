public class Person {
int personID;
String name;
int companyID;
int tableID;

public Person (int id, String pname, int coID) {
	this.personID = id;
	this.name = pname;
	this.companyID = coID;

} //Close this.person
public String toString() {
	return ("This persons name is " + name + "Their ID is" + personID + "Their company ID is" + companyID);
}//close strign to String
}//close Person
