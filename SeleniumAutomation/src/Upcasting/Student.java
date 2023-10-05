package Upcasting;
/*"Create  3 class as Student,Mentor,Teacher
create methods inside each class, then do UPcasting"*/
class Teacher
{
	void t_subject()
	{
		System.out.println("Mathematics");
	}
}
class Mentor extends Teacher
{
	void m_Subject()
	{
		System.out.println("General Knowledge");
	}
}
public class Student extends Mentor
{
	void s_class()
	{
		System.out.println("1st Standard");
	}
	public static void main(String[] args) 
	{
		Teacher t=new Student();//implicit upcasting
		t.t_subject();
		Student st=(Student)t;
		st.s_class();
		st.m_Subject();
		st.t_subject();
	}

}
