package cm.stagiaire.findjob.findjob.Service.Implementation;

import cm.stagiaire.findjob.findjob.Entities.Role;
import cm.stagiaire.findjob.findjob.Entities.User;
import cm.stagiaire.findjob.findjob.Repositories.RoleRepository;
import cm.stagiaire.findjob.findjob.Repositories.UserRepository;
import cm.stagiaire.findjob.findjob.Service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional


public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceImplementation(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsernameIgnoreCase(username);
    }

    @Override
    public Role getRole(String roleName) {
        return roleRepository.findByRoleNameIgnoreCase(roleName);
    }

    @Override
    public User updateUser(String username, User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean delete(String phoneNumb) {
        userRepository.deleteByPhoneNumbIgnoreCase(phoneNumb);
        return Boolean.TRUE;

    }

    @Override
    public User addRoleToUser(String username, String roleName) {
        User user=getUser(username);
        Role role=getRole(roleName);
        user.getRoles().add(role);
        role.getUsers().add(user);
        return userRepository.save(user);
    }
}
