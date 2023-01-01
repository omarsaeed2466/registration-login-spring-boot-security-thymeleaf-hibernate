package com.example.registrationloginspringbootsecuritythymeleafhibernate.MODEL;

import jakarta.persistence.*;

import java.util.Collection;


@Entity
@Table(name = "USER_SECURITY" )
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "FIRST_NAME")
    private String firstName ;
    @Column(name = "LAST_NAME")
    private String lastName ;
    private String password ;
    private String email ;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "USER_ROLE_SECURITY",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles ;

    public User() {
    }

    public User(String firstName, String lastName, String password, String email, Collection<Role> roles) {
      super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.roles = roles;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
