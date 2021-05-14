package microservices.app.recallista.user;

import lombok.*;

/**
 * This class stores information to identify the user.
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {

    private Long id;
    private String alias;
}
