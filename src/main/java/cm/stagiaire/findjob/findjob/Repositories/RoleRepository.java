package cm.stagiaire.findjob.findjob.Repositories;


import cm.stagiaire.findjob.findjob.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleNameIgnoreCase(String roleName);

}

