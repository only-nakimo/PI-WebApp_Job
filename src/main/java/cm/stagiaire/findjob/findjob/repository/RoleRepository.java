package cm.stagiaire.findjob.findjob.repository;

import cm.stagiaire.findjob.findjob.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleNameIgnoreCase(String roleName);

}
