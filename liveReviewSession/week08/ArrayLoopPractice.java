package week08;

public class ArrayLoopPractice {

    public static void main(String[] args) {
        
        double[] prices = { 200, 100, 3000 ,122, 123,240, 180 };

        for (double price : prices) {
            if ( price >=120 && price <=200) {
                System.out.println("price = " + price);
            }
        }

        System.out.println("-----------count of the prices more than 200");
        int count = 0;
        for (double price : prices) {
            if (price >= 200) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
