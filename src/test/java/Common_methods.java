import java.util.Random;

public class Common_methods {

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length()); // Generate a random index
            result.append(characters.charAt(index)); // Append the character at the random index
        }

        return result.toString();
    }
}
