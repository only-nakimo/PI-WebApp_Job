package cm.stagiaire.findjob.findjob.Service;

import cm.stagiaire.findjob.findjob.Entities.Role;
import cm.stagiaire.findjob.findjob.Entities.User;
import java.util.List;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    List<User> getUsers();
    User getUser(String username);
    Role getRole(String roleName);
    User updateUser(String username, User user);
    Boolean delete(String phoneNumb);
    User addRoleToUser(String username, String roleName);

}
