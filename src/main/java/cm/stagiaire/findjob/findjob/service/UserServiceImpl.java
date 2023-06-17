package cm.stagiaire.findjob.findjob.service;

import cm.stagiaire.findjob.findjob.dto.AddRoleToUserRequestDTO;
import cm.stagiaire.findjob.findjob.entity.Role;
import cm.stagiaire.findjob.findjob.entity.User;
import cm.stagiaire.findjob.findjob.repository.RoleRepository;
import cm.stagiaire.findjob.findjob.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
@Transactional


public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User addNewUser(User user) {
        return this.userRepository.save(user);
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
    public User addRoleToUser(AddRoleToUserRequestDTO userRequestDTO) {
        //rechercher le role
        Role role = this.roleRepository.findByRoleNameIgnoreCase(userRequestDTO.getRoleName());
        //créer un tableau de roles

        //recherche l'utilisateur
        User user = this.userRepository.findByUsernameIgnoreCase(userRequestDTO.getUserEmail());

        Collection<Role> roles = user.getRoles();
        roles.add(role);

        user.setRoles((List<Role>) roles);
        this.userRepository.save(user);
        return this.userRepository.save(user);
    }

    @Override
    public Role addRole(Role role){
        return this.roleRepository.save(role);
    }
}
