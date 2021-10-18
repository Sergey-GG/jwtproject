package vntu.fcsa.gonchar.jwtproject.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class SignupRequest {

    private String userName;
    private String email;
    private Set<String> roles;
    private String password;


}
