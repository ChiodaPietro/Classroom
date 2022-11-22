package Main;

public class Main {
    public static void main(String[] args) {
        Classroom ai = new Classroom(128, "4AI", new Student[4], new Professor[4]);
        ai.setStudents(0, new Student("giorgio", "vanni", 2342, new Address("piazza", "giorgio", 5), "ADCD4S", 12345));
        ai.setStudents(1, new Student("Carlo", "vanni", 2342, new Address("piazza", "giorgio", 5), "ADCD4S", 12341));
        ai.setStudents(2, new Student("Annibale", "vanni", 2342, new Address("piazza", "giorgio", 5), "ADCD4S", 123412));
        ai.setStudents(3, new Student("Amico", "vanni", 2342, new Address("piazza", "giorgio", 5), "ADCD4S", 108708));
        ai.setProfessors(0, new Professor("ASOIFADS", "ANNIBALE", "Sirgary", 1234123, new Address("piazza", "giorgio" ,2), 12, "math", 1222));
        System.out.println(ai.getStudent(12345).toString());
        System.out.println(ai.getProfessor("math"));
    }
}
