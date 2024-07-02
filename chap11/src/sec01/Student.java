package sec01;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;		
	}
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student students = (Student) obj;
			if (this.studentNum.equals(students.studentNum)) {
				return true;
			}
		}return false;
	}
	@Override
	public int hashCode() { // 주소값이 hashcode값이 아니라 studentNumr가 hashcode가 되도록 재정의
		return studentNum.hashCode();
		}
}
