package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.dto.AddRoleToUserRequestDTO;
import cm.stagiaire.findjob.findjob.entity.Role;
import cm.stagiaire.findjob.findjob.entity.User;
import java.util.List;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    List<User> getUsers();
    User getUser(String username);
    Role getRole(String roleName);
    User updateUser(String username, User user);
    Boolean delete(String phoneNumb);
    User addRoleToUser(AddRoleToUserRequestDTO userRequestDTO);

    Role addRole(Role role);
}
