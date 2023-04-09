package web.entity;


import javax.persistence.*;


@Entity
@Table(name = "usersW")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "hobby")
    private boolean hobby;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public boolean isHobby() {
        return hobby;
    }

    public void setHobby(boolean hobby) {
        this.hobby = hobby;
    }

    public User(String firstName, String surname,  boolean hobby) {
        this.firstName = firstName;
        this.surname = surname;
        this.hobby = hobby;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + surname + '\'' +

                ", hobby=" + hobby +
                '}';
    }
}