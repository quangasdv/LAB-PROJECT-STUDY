public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van Phep", "123 Le Van Sy");
        System.out.println(person.toString());
        System.out.println();

        Student student = new Student("Nguyen Thi No", "456 Cong Hoa", "Computer Science", 2, 5000);
        System.out.println(person.toString());
        System.out.println();

        Staff staff = new Staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000);
        System.out.println(staff.toString());
    }
    
}
