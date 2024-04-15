

class Student{
	int ID;
	String name;
	String sex;
	boolean isLeader;
	float gradeMath, gradeChinese, gradeEnglish;

	public void setBasic(int ID, String gname, String sex, boolean isLeader){
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.isLeader = isLeader;
	}
	public void setGrade(float gradeMath,float gradeChinese,float gradeEnglish){
		this.gradeMath = gradeMath;
		this.gradeChinese = gradeChinese;
		this.gradeEnglish = gradeEnglish;
	}
	public float allGrade(){
		return gradeMath + gradeChinese + gradeEnglish;
	}
	public float average(){
		return allGrade()/3;
	}
}



public class ch6_3Student{
	public static void main(String[] args){
		Student s = new Student();
		s.setBasic(123,"ZS","M",false);
		s.setGrade(100,90,80);
		System.out.println("Total Grade = "+s.allGrade());
		System.out.println("The Average = "+s.average());

	}

}