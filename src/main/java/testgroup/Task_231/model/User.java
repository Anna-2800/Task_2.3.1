package testgroup.Task_231.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "age")
    private int age;

    @Column(name = "programmingLanguage")
    private String programmingLanguage;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public User(){}

    public User(int id, String name, String lastname, int age, String programmingLanguage){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString(){
        return "User " + this.getId() + "\n"
                + this.getName() +"\n" + this.getLastname()
                + "\n" + this.getAge() + "\n" + this.getProgrammingLanguage();
    }
}
