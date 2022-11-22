package Main;


public class Persona  {
    private String security_number;
    private String name;
    private String surname;
    private int phone_number;
    private Address address;
    public Persona(String security_number, String name, String surname, int phone_number, Address address) {
        this.address = address;
        this.name = name;
        this.phone_number = phone_number;
        this.security_number = security_number;
        this.surname = surname;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSecurity_number(String security_number){
        this.security_number = security_number;
    }
    public void setSurname(String surname){this.surname=surname;}
    public void setPhone_number(int phone_number){this.phone_number=phone_number;}
    public void setAddress(Address address){this.address=address;}

    public String getSecurity_number() {
        return security_number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "security_code='" + security_number + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number=" + phone_number +
                ", address=" + address +
                '}';
    }

}
