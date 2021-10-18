package vntu.fcsa.gonchar.jwtproject.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest {

    private String userName;
    private String password;
}
