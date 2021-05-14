package microservices.app.recallista.challenge;

import lombok.Value;

/**
 * Attempt coming from the user
 */
@Value
public class ChallengeAttemptDTO {

    int factorA;
    int factorB;
    String userAlias;
    int guess;
}
