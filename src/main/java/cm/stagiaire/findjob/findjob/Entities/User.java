package cm.stagiaire.findjob.findjob.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS_LIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userId;
    @Column(name = "USER_NAME", length = 20,unique = true)
    private String username;
    @Column(name= "USER_EMAIL",unique = true)
    private String email;
    private String password;
    @Column(unique = true, length = 15)
    private String phoneNumb;
    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    @Column
    private List<Role> roles =new ArrayList<>();



}

