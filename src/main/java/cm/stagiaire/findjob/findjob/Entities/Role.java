package cm.stagiaire.findjob.findjob.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "ROLES_LIST")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(unique = true, length = 20)
        private String roleName;
        @ManyToMany
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private List<User> users=new ArrayList<>();
    }

