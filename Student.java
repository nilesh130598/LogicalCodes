package LogicalPrograms;

public class Student implements Comparable<Student> {
	String nanme;
	int rno;

	public Student(String nanme, int rno) {
		super();
		this.nanme = nanme;
		this.rno = rno;
	}

	

	@Override
	public int compareTo(Student o) {
		
	if(this.rno>o.rno)
		return 1;
	else if(this.rno==o.rno)
	return 0;
	else
		return -1;
		

	}
	
}
