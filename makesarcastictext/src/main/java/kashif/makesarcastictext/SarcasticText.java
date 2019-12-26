package kashif.makesarcastictext;

public class SarcasticText {

    public static String makeSarcasticText(String text) {
        text = text.trim();

        String[] tokens = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String token : tokens) {
            StringBuilder textToken = new StringBuilder();

            for (int i = 0; i < token.length(); i++) {

                if (i % 2 == 0) {
                    textToken.append(token.charAt(i));
                } else {

                    if (token.charAt(i) >= 'a' && token.charAt(i) <= 'z') {
                        textToken.append(Character.toUpperCase(token.charAt(i)));
                    } else if (token.charAt(i) >= 'A' && token.charAt(i) <= 'Z') {
                        textToken.append(Character.toLowerCase(token.charAt(i)));
                    } else {
                        textToken.append(token.charAt(i));
                    }

                }

            }
            result.append(textToken).append(" ");
        }

        return result.toString();
    }

}
