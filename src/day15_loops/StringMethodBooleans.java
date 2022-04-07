package day15_loops;

public class StringMethodBooleans {

    public static void main(String[] args) {

        String str = "";
        boolean result = str.isEmpty();

        System.out.println(result);
        System.out.println(str.isBlank());

        str += "a ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println("----------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("----------------------");
        String sentence = "My favorite programming language is JAVA";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasjava = sentence.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasjava = " + hasjava);

        System.out.println("----------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Wooden");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wood");

    }
}
