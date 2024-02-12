package org.LogicalPrograms;

public class GivenNoIsPrime {
    public static void main(String[] args) {
        int value=31;
        boolean flag=false;

        for (int i = 2; i <=value/2; i++)
        {
            if(value%i == 0) {
                flag=true;
                break;
            }
        }
        if (flag)
        {
            System.out.println("Is not prime number");
        }
        else
        {
            System.out.println("Is prime number");
        }

    }
}
