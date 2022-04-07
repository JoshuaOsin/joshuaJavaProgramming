package day34GarbageCollectorAccessModifier;

import static day34GarbageCollectorAccessModifier.AccessModifiers.*;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData); privateData not visible

        publicMethod();
        defaultMethod();
        //privateMethod(); // cannot reachable out of class

    }
}
