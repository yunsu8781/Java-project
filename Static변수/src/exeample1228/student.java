package exeample1228;

public class student {

	static int CODENUMBER = 1000;

	int classNumber=1;
	int studentID = 0;
	
	public student() {
		studentID += CODENUMBER;
		CODENUMBER++;
	}
}
