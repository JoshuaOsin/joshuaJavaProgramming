package day51_Map_Enum;

import day11_SwitchScanner.Browser;

public class EnumTest {

    public static void main(String[] args) {

        //   String browser = "Wooden Spoon";
        Browsers browser = Browsers.SAFARI;

        browser = Browsers.CHROME;

        switch(browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }


        System.out.println("-------------------");


        Seasons season = Seasons.SUMMER;

        System.out.println("season = " + season);

        Levels level = Levels.LEMON;

        System.out.println("level = " + level);


    }
}
