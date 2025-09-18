package logic;

public class Client {
    private String name;
    private String lastName;
    private String id;
    private String phone;
    private int age;
    private String direccion;    

    public Client() {
    }
    
    public Client(String name, String lastName, String id, String phone, int age, String direccion) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
        this.age = age;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "--------------------"
        + "\n Client:"
        + "\n name: " + name
        + "\n lastName: " + lastName
        + "\n id: " + id
        + "\n phone: " + phone
        + "\n age: " + age
        + "\n direccion: " + direccion;
    }
    
    
}
