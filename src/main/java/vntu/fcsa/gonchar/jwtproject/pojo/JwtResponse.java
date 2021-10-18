package vntu.fcsa.gonchar.jwtproject.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vntu.fcsa.gonchar.jwtproject.models.Role;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String userName;
    private String email;
    private List<String> roles;

    public JwtResponse(String token, Long id, String userName, String email, List<String> roles) {
        this.token = token;
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.roles = roles;
    }
}
