package day11_SwitchScanner;

public class Browser {
    public static void main(String[] args) {
        String browseName = "safari";

        String result = "";

        boolean validBrowser = browseName == "chrome" || browseName == "firefox" ||
                browseName == "opera" ||browseName == "safari" ||browseName == "edge";

        if (validBrowser){
            //5 options
            if (browseName == "chrome"){
                result = "Chrome Browser is selected";
            } else if(browseName == "firefox"){
                result = "firefox Browser is selected";
            } else if(browseName == "opera"){
                result = "opera Browser is selected";
            } else if(browseName == "safari"){
                result = "safari Browser is selected";
            } else {
                result = "Edge Browser is selected";
            }
        } else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);
    }

}
/*
Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected
 */