package cm.stagiaire.findjob.findjob.controller;

import cm.stagiaire.findjob.findjob.dto.AddRoleToUserRequestDTO;
import cm.stagiaire.findjob.findjob.entity.Role;
import cm.stagiaire.findjob.findjob.entity.User;
import cm.stagiaire.findjob.findjob.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/users")
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.addNewUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(this.userService.getUsers());
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable(name = "username") String username) {
        return ResponseEntity.ok(this.userService.getUser(username));
    }

    @PutMapping("/{username}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable(name = "username") String username) {
        return ResponseEntity.ok(this.userService.updateUser(username, user));
    }

    @DeleteMapping("/{phoneNumb}")
    public ResponseEntity<String> deleteUser(@PathVariable(name = "phoneNumb") String phoneNumb) {
        return ResponseEntity.ok("user cancellation over !");
    }

    @PutMapping("/add-role-to-user")
    public User addRoleToUser(@RequestBody AddRoleToUserRequestDTO addRoleToUserRequestDTO){
        return this.userService.addRoleToUser(addRoleToUserRequestDTO);
    }

    @PostMapping("/add-role")
    public Role addRole(@RequestBody Role role){
        return this.userService.addRole(role);
    }

}
