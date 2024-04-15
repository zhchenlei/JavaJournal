package ch8_1_Person_Student;

class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getInfo(){
        return "Name:"+name+"\nAge:"+age;
    }
}

class Student extends Person{
    Student(){
        System.out.println("Studnet Construct…");
    }
        private String school;
        public void setSchool(String school){
            this.school = school;  
        }
        public String getSchool(){
            return school;
        }
        public String getInfo(){
            return  "Name:"+getName()+"\nAge"+getAge()+"\nschool:"+getSchool();
        }
}

public class ch8_1_Person_Student {
    public static void main(String[] agrs){
        Student stu = new Student();
        stu.setAge(20);
        stu.setName("陈磊");
        stu.setSchool("兰州理工大学");
        System.out.println("Name:"+stu.getName()+"\tAge:"+stu.getAge()+"\t\tSchool:"+stu.getSchool());
        System.out.println(stu.getInfo());
    }
}
