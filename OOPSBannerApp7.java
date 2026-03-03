/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns using an Inner Static Class
 */
public class BannerApp {

    /**
     * Inner Static Class that encapsulates a character
     * and its 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character the character
         * @param pattern the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return 7-line pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility Static Methods to build patterns

    public static String[] buildOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    public static String[] buildPPattern() {
        return new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    public static String[] buildSPattern() {
        return new String[]{
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******  "
        };
    }

    public static void main(String[] args) {

        // Create array of CharacterPatternMap objects
        CharacterPatternMap[] characters = {
                new CharacterPatternMap('O', buildOPattern()),
                new CharacterPatternMap('P', buildPPattern()),
                new CharacterPatternMap('S', buildSPattern())
        };

        String[] banner = new String[7];

        // Build each row of banner
        for (int i = 0; i < 7; i++) {

            StringBuilder row = new StringBuilder();

            // O
            row.append(characters[0].getPattern()[i]).append("   ");
            // O again
            row.append(characters[0].getPattern()[i]).append("   ");
            // P
            row.append(characters[1].getPattern()[i]).append("   ");
            // S
            row.append(characters[2].getPattern()[i]);

            banner[i] = row.toString();
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}