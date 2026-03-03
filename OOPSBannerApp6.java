public class BannerApp {

    // Helper method to generate O pattern
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };
    }

    // Helper method to generate P pattern
    public static String[] getPPattern() {
        return new String[] {
            "*******  ",
            "*      * ",
            "*      * ",
            "*******  ",
            "*        ",
            "*        ",
            "*        "
        };
    }

    // Helper method to generate S pattern
    public static String[] getSPattern() {
        return new String[] {
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

        // Get patterns using static methods
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Create banner with 7 lines
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
        }

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}