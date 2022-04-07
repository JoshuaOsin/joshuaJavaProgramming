package week05;

public class ReplacePractice {

    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.replace("hub","lab"));
        // actually and object

        System.out.println("word = " + word);

        String serachresult = "1-48 of over 6,000 results for java";

        String result = serachresult.replace("1-48 of over ","").
                replace(" results for java","");

        String expectedResult = "6,000";
        if (expectedResult.equals(result)) {
            System.out.println("pass " +result+ " , "+ expectedResult);
        } else
            System.out.println("fail "+result+ " , "+ expectedResult);
    }
}
