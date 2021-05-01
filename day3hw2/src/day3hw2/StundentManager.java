package day3hw2;

public class StundentManager {
	
	public void add (Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" eklendi.");
	}
	
	public void update (Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" güncellendi.");
	}
	
	public void delete (Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" silindi.");
	}
	

}
