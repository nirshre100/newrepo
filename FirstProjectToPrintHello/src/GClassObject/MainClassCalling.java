package GClassObject;

public class MainClassCalling {

	public static void main(String[] args) {
		StudentClass stu = new StudentClass();
		stu.setStudentid(1);
		stu.setName("niraj");
		stu.setAge(25);
		
		
		
		stu.name = "niraj";
		stu.age = 42;
		System.out.println("Student id:- " + stu.getStudentid()+ " , " + "Student Name is :- " + stu.getName()
				+ "Studnet age is :-" + stu.getAge());
		
		
		StudentClass stu1 = new StudentClass();
		stu1.setStudentid(2);
		stu1.setName("Rajina Joshi");
		stu1.setAge(37);
		System.out.println("Student id:- " + stu1.getStudentid() + " , " + "Student Name is :- " + stu1.getName()
				+ "Studnet age is :-" + stu1.getAge());
		

	}

}
