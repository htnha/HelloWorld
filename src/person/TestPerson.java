package person;

public class TestPerson {
    public static void main(String[]args){
        Student st1 = new Student("abc", 20, "Dong hoi", 8);
        Student st2 = new Student("xyz", 24, "Minh hoa", 9);
        Teacher t1 = new Teacher("zj", 30, "Dong hoi", 1000000);
        Teacher t2 = new Teacher("iowi", 34, "Le thuy", 2000000);
        st1.display();
        st2.display();
        t1.display();
        t2.display();
    }
}
