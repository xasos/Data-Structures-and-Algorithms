public class BubbleSort {

    public static void main(String[] args) {
        
        int temp = 0;
        boolean flag = true;
        
        //populate array
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int)(Math.random() * 20));
            System.out.print("[" + nums[i] + "]");           
        }
        
        System.out.println("");
            
        //Apply Bubble Sort
        while(flag) {
            flag = false;
            for (int i = 0; i < (nums.length-1); i++) { //If for loop is entered, the array is not sorted yet
                if (nums[i+1] < nums[i]) {
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                    flag = true; //This signals to rerun the while loop until fully sorted
                }            
            }   
        } 
        
        //print sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.print("[" + nums[i] + "]");
        }
     }    
}
