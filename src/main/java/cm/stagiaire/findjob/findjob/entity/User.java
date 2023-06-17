package cm.stagiaire.findjob.findjob.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS_LIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    @Column(name = "USER_NAME", length = 20,unique = true)
    @NotNull
    private String username;
    @Email
    private String email;
    @NotNull
    private String password;
    @Column(unique = true)
    private String phoneNumb;
    @OneToMany(mappedBy = "roleName")
    private List<Role> roles =new ArrayList<>();



}
