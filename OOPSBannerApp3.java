/**
 * OOPSBannerApp UC3 OOPS Banner Application (Use Case 3)
 * Refactored to use String.join() for memory efficiency and readability.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // We use "" as the delimiter to join segments without extra spaces
        // or " " if you need specific alignment between segments.
        
        // Line 1
        System.out.println(String.join("", "  *** ", "  *** ", " ***** ", " **** "));
        
        // Line 2
        System.out.println(String.join("", " ** **", " ** **", " ** **", " ** "));
        
        // Line 3
        System.out.println(String.join("", " ** **", " ** **", " ** **", "  *** "));
        
        // Line 4
        System.out.println(String.join("", " ** **", " ** **", " ***** ", "    ** "));
        
        // Line 5
        System.out.println(String.join("", " ** **", " ** **", " ** ", "    ** "));
        
        // Line 6
        System.out.println(String.join("", " ** **", " ** **", " ** ", " ** **"));
        
        // Line 7
        System.out.println(String.join("", "  *** ", "  *** ", " ** ", "  **** "));
    }
}