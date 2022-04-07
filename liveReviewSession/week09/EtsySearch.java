package week09;

public class EtsySearch {
    public static void main(String[] args) {
        System.out.println("--Starting UI Automation testing for Etsy Website---");

        openBrowser("Chrome");

        navigateToUrl("https://www.etsy.com");

        searchFroItem("Java");

        if (verifyItemIsDisplayed().equals("PASS")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }


    }
    public static void openBrowser (String browser) {
        System.out.println("Launching "+ browser + "browser");
    }
    public static void navigateToUrl(String url) {
        System.out.println("Navigate to "+ url);
    }

    public static void searchFroItem(String item) {
        System.out.println( "PASS : verify "+ item+ "exits");
        System.out.println( "Click on that "+ item);
    }

    public static String verifyItemIsDisplayed () {
        String result = "FAIL";
        return result;
    }
}
