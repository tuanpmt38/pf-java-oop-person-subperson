public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("tuan","ha noi");
        System.out.println(person.toString());

        Student student = new Student("tuan","ha noi","java core",2018,500.0);
        System.out.println(student.toString());

        Staff staff = new Staff("tuan","ha noi","codegym",1.2);
        System.out.println(staff.toString());
    }
}
