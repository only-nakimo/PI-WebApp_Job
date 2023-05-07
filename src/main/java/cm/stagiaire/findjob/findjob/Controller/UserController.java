package cm.stagiaire.findjob.findjob.Controller;

        import cm.stagiaire.findjob.findjob.Entities.User;
        import cm.stagiaire.findjob.findjob.Service.UserService;
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

}

