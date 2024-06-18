package quiz;

import myobj.AcademyStudent;
import myobj.MlStudent;
import myobj.NetworkStudent;
import myobj.ProgrammingStudent2;

public class C09_Academy {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 100; i++) {
			AcademyStudent stu;
			
			switch((int)(Math.random() * 2)) {
			case 0:
				stu = new MlStudent();
				break;
			case 1:
				stu = new ProgrammingStudent2();
				break;
			default:
				stu = new NetworkStudent();
				break;
			}
			
			AcademyStudent.printDetail(stu);
		}
		
	}
}
