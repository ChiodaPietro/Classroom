package Main;

public class Professor extends Persona {
    private int number;
    private String subject;
    private double salary;
    public Professor(String security_code, String name, String surname, int phone_number, Address address, int number, String subject, double salary){
        super(security_code, name, surname, phone_number, address);
        this.number=number;
        this.subject= subject;
        this.salary=salary;
    }
    public void setNumber(int number){this.number=number;}
    public void setSubject(String subject){this.subject=subject;}
    public void setSalary(double salary){this.salary=salary;}
    public int getNumber(){return number;}
    public String getSubject(){return subject;}
    public double getSalary(){return salary;}
    public String toString(){
        return super.toString()+"\n" +
                "number="+number+"\n" +
                "subject="+subject+"\n" +
                "salary="+salary;
    }
}
