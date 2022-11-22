package Main;

public class Classroom {
    private int number;
    private String name;
    private Student[] students;
    private Professor[] professors;
    public Classroom(int number, String name, Student[] students, Professor[] professors){
        this.number=number;
        this.name=name;
        this.students=students;
        this.professors=professors;
    }
    public void setNumber(int number){this.number=number;}
    public void setName(String name){this.name=name;}
    public void setStudents(int pos, Student student){this.students[pos]=student;}
    public void setProfessors(int pos, Professor professor){this.professors[pos]=professor;}

    public int getNumber() {
        return number;
    }

    public Professor[] getProfessors() {
        return professors;
    }
    public Student[] getStudents(){
        return students;
    }
    public String getName(){
        return name;
    }
    public Student getStudent(int matricola){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getMatricola()==matricola){
                return students[i];
            }
        }
        return null;
    }
    public Professor getProfessor(int number){
        for (int i = 0; i < professors.length; i++) {
            if(professors[i].getNumber()==number){
                return professors[i];
            }
        }
        return null;
    }
    public Professor getProfessor(String subject){
        for (int i = 0; i < professors.length; i++) {
            if(professors[i].getSubject().equals(subject)){
                return professors[i];
            }
        }
        return null;
    }
}
