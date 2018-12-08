package by.bsuir.karamach.serviceworker.security;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.UUID;

@Component
public class SecurityHelper {
    private static final int TOKEN_LENGTH = 20;


    private SecureRandom random = new SecureRandom();

    public String generateTempToken() {
        byte bytes[] = new byte[TOKEN_LENGTH];
        random.nextBytes(bytes);
        String token = bytes.toString();

        return token;
    }

    public String generateActivationCode() {
        return UUID.randomUUID().toString();
    }
}
