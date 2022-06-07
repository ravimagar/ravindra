package com.depends;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsPractice {
    @Test(groups = "smoke")
    public void dependsOnMet1 (){
        String s = "Ravi";
        System.out.println("Hi I am depends on method 1");
        Assert.assertEquals(s,"Rvi","should be match");
    }
    @Test(dependsOnGroups = "smoke")
    public void dependsOnMet2 (){
        System.out.println("Hi I am depends on method 2");
    }
    @Test(dependsOnGroups = "smoke")
    public void dependsOnMet3 (){
        System.out.println("Hi I am depends on method 3");
    }
    @Test(dependsOnGroups = "smoke")
    public void dependsOnMet4 (){
        System.out.println("Hi I am depends on method 4");
    }
    @Test(dependsOnGroups = "smoke")
    public void dependsOnMet5 (){
        System.out.println("Hi I am depends on method 5");
    }

}
