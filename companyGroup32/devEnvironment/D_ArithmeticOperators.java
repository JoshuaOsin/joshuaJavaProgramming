package devEnvironment;

public class D_ArithmeticOperators {
    public static void main(String[] args) {
        // Use two numbers
        double firstNumber = 10;
        double secondNumber = 2.5;
        double result = 0;
        char mathOperator = '/';

        //****** Arithmetic Operators Integration ****

        switch (mathOperator) {
            case '+':  //******** Addition **********
                result = firstNumber + secondNumber;
                break;
            case '-':  //******** Substruction ******
                result = firstNumber - secondNumber;
                break;
            case '*':  //******** Multiplication ****
                result = firstNumber * secondNumber;
                break;
            case '/':  //******** Division **********
                result = firstNumber / secondNumber;
                break;
        }

        System.out.println(firstNumber + " " + mathOperator + " "
                + secondNumber + " = " + result);
    }
}
/*
Create a class called Calculator, Given two double variables named firstNumber & secondNumber, and a char variable named mathOperator, write a program that can calculate c of firstNumber&secondNumber based on the given math Operator.

		char operator -> -, +, *, /

		when operator  + : add firstNumber, secondNumber
		when operator  - : minus firstNumber, secondNumber
		when operator  * : multiply firstNumber, secondNumber
		when operator  / : divide firstNumber, secondNumber
		for any other operators: print "invalid operator"

		Ex:
			firstNumber = 10, secondNumber= 20, mathOperator = '+'

		output:
			30

 */