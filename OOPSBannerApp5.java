public class BannerApp {

    public static void main(String[] args) {
        // UC5 Goal: Combine declaration and initialization in a single statement
        // using String.join() for cleaner code.
        
        String[] banner = {
            String.join("", " ******* ", "  ***** "),
            String.join("", " * * ", " * * "),
            String.join("", " * * ", " * * "),
            String.join("", " * * ", " * * "),
            String.join("", " * * ", " * * "),
            String.join("", " * * ", " * * "),
            String.join("", " ******* ", "  ***** ")
        };

        // Use an enhanced for-loop (for-each) to display the banner
        System.out.println("--- Optimized Banner Output ---");
        for (String line : banner) {
            System.out.println(line);
        }
    }
}