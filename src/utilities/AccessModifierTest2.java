package utilities;

import day34GarbageCollectorAccessModifier.AccessModifiers;

import static day34GarbageCollectorAccessModifier.AccessModifiers.*;

public class AccessModifierTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); defaultData not visible
        //System.out.println(AccessModifiers.privateData); privateData not visible

        publicMethod();
        //defaultMethod(); // cannot reachable out of package
        //privateMethod(); // cannot reachable out of class

    }
}
