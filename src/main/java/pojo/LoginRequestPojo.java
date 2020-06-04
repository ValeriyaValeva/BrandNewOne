package pojo;
import lombok.*;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString
@AllArgsConstructor
public class LoginRequestPojo {
    private String username;
    private String password;
    private Boolean keepSignedIn;
}
