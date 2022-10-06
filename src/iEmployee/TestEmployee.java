package iEmployee;

public class TestEmployee {
    public static void main(String[]args){
        IEmployee e1 = new PartTimeEmployee("abc",20, 4);
        IEmployee e2 = new PartTimeEmployee("xyz",10, 5);
        IEmployee e3 = new FullTimeEmployee("ttt",15);
        IEmployee[] e_list = {e1, e2, e3};
        for (IEmployee em:e_list
             ) {
            System.out.println(em.getName() + " has salary:" + em.calculateSalary());
        }
    }
}
