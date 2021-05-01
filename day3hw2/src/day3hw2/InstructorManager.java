package day3hw2;

public class InstructorManager {
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+" eklendi.");
	}
	
	public void update (Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+" güncellendi.");
	}
	
	public void delete (Instructor instructor) {
		System.out.println(instructor.getFirstName()+instructor.getLastName()+" silindi.");
	}

}
