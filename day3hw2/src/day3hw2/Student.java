package day3hw2;

public class Student extends User{
	
			int studentId;
			String lessonSubject; //Hangi yazilim kursunu kullandigini tespit ediyor

		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getLessonSubject() {
			return lessonSubject;
		}
		public void setLessonSubject(String lessonSubject) {
			this.lessonSubject = lessonSubject;
		}
}
