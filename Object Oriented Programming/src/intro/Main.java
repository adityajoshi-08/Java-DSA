package intro;

public class Main {
    public static void main(String[] args) {
        Student aditya = new Student();
        Student aditya2 = new Student(2,"Aditya", 100f);
        System.out.println(aditya2.rno + " "+aditya2.name+ " "+aditya2.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this(13,"Aditya", 12.2f);
    }

//    this is more generalised
    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
