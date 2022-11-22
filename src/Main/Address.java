package Main;

public class Address {
    private String type;
    private String name;
    private int number;

    public Address(String type, String name, int number) {
        this.type = type;
        this.name = name;
        this.number = number;
    }
    public String getType(){return type;}
    public String getName(){return name;}
    public int getNumber(){return number;}
    public void setType(String type){this.type=type;}
    public void setName(String name){this.name=name;}
    public void setNumber(int number){this.number=number;}
}
