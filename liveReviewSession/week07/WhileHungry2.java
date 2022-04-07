package week07;

public class WhileHungry2 {
    public static void main(String[] args) {

        int bananas = 0;
        int countToFull = 3;

        while (true) {
            bananas++;
            System.out.println("Eating a banana \uD83C\uDF4c" + bananas);
            // condition that will change boolean to false
            if (bananas == countToFull) {
                break; // branching statements
            }
        }
        System.out.println("Had enough bananas, let's get back to study");
    }
}
