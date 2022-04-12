package utilities;

import day40_ProtectedModifier_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(ProtectedAccessModifier.name1); // default is not visible outside package
        System.out.println(ProtectedAccessModifier.name2); // protected is NOW visible since subclass

        //AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();
    }
}
