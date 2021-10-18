package vntu.fcsa.gonchar.jwtproject.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {
    @GetMapping("/all")
    public String getAll() {
        return "public API";
    }
@GetMapping("/user")
@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String getUserApi() {
        return "User API";
    }
    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public String getModApi() {
        return "Moderator API";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdminApi() {
        return "Admin API";
    }
}