package cm.stagiaire.findjob.findjob.Repositories;

import cm.stagiaire.findjob.findjob.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUsernameIgnoreCase(String username);
    void deleteByPhoneNumbIgnoreCase(String phoneNumb);

}