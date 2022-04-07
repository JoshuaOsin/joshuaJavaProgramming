package day32_Constructor;

public class Carpet {

        public double width, length, unitPrice;
        public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Price= $" + calcCost() +
                '}';
    }

    // calculate the total cost of the carpet and return it as double
    public double calcCost(){
        double totalPrice = width*length*unitPrice;
        if (isPersian){
            totalPrice+= 200;
        }
        return totalPrice;
    }
}
