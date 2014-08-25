package arrays;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        int[] numArr = new int[10];
        int sum = 0;
        
        //populate arraylist
        for (int i = 0; i < 10; i++) {
            numList.add((int)(Math.random() * 20));
        }
        
        //simple copy into array
        for (int i = 0; i < 10; i++) {
            numArr[i] = numList.get(i);
        }
        
        //simple for each loop
        for (int x : numList) {
            sum+=x;
        }
        System.out.println("The sum of the terms is: " + sum);
    }
    
}
