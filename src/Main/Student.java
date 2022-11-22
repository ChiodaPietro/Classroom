package Main;

public class Student extends Persona {
    private int matricola;
    public Student(String name, String surname, int phone_number, Address address, String security_code, int matricola){
        super(security_code, name, surname, phone_number, address);
        this.matricola=matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String toString(){
        return super.toString()+"\n" +
                "Student:\n"+
                "matricola="+matricola;
    }
}
