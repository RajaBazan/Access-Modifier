package hello.com;
class MyEmployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Lec_40_Access_modifier_getters_setters {
    public static void main(String[] args) {
        System.out.println("Here we are going to enter the data of the the First  Employee-->");
        MyEmployee name = new MyEmployee();
        name.setName("Raja Bazan Muneeb");
        name.getName();
        name.setId(1);
        name.getId();
        System.out.println("The name of the employee is : " + name.getName() );
        System.out.println("The ID of the employee is : " + name.getId() );
        System.out.println("Here we are going to enter the data of the the second Employee-->");
        MyEmployee name1 = new MyEmployee();
        name1.setName("Rohail");
        name1.getName();
        name1.setId(2);
        name1.getId();
        System.out.println("The name of the 2nd employee is:  " + name1.getName());
        System.out.println("The ID of the 2nd employee is:  " + name1.getId());

    }
}
