/**
 * OOPSBannerApp UC4 Render OOPS as Banner using String Array and Loop
 * This class improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of lines (7)
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join()
        // Format: O, O, P, S segments joined by an empty string delimiter
        lines[0] = String.join("", "  *** ", "  *** ", " ***** ", " **** ");
        lines[1] = String.join("", " ** ** ", " ** ** ", " ** ** ", " ** ");
        lines[2] = String.join("", " ** ** ", " ** ** ", " ** ** ", "  *** ");
        lines[3] = String.join("", " ** ** ", " ** ** ", " ***** ", "    ** ");
        lines[4] = String.join("", " ** ** ", " ** ** ", " ** ", "    ** ");
        lines[5] = String.join("", " ** ** ", " ** ** ", " ** ", " ** ** ");
        lines[6] = String.join("", "  *** ", "  *** ", " ** ", "  **** ");

        // 3. Use an enhanced for-loop (for-each) to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}