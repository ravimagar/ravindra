package com.depends;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
    @Test
    public void dependsExample1() {
        System.out.println("dependsOnMethods 1");
    }

    @Test(dependsOnMethods = "dependsExample1")
    public void dependsExample2() { System.out.println("dependsOnMethods 2"); }

    @Test(dependsOnMethods = "dependsExample2")
    public void dependsExample3() {
        System.out.println("dependsOnMethods 3");
    }

    @Test(dependsOnMethods = "dependsExample3")
    public void dependsExample4() {
        System.out.println("dependsOnMethods 4");
    }

    @Test(dependsOnMethods = "dependsExample1")
    public void dependsExample5() {
        System.out.println("dependsOnMethods 5");
    }
} 

