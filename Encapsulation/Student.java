package encapsulation;

public class Student {
private int sId=200;
private String sName="veeru";
private int sMarks=99;
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getsMarks() {
	return sMarks;
}
public void setsMarks(int sMarks) {
	this.sMarks = sMarks;
}

}
