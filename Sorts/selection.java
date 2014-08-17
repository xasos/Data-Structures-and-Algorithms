public class SelectionSort {

    public static void main(String[] args) {
        int temp;
        int first;
        
        // populate array
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int)(Math.random() * 20));
            System.out.print("[" + nums[i] + "]");           
        }
        
        // apply selection sort
        for (int i = 0; i < nums.length; i++) {
            first = i; // change starting point every time loop is entered
            for (int j = i; j < nums.length; j++) { // essentially, we are finding the minimum
                if (nums[first] > nums[j]) {
                    first = j;
                }
            }     
            
            //swap first element in the array that is unsorted with lowest value in array
            temp = nums[i];
            nums[i] = nums[first];
            nums[first] = temp;            
        }
        
        //print out sorted array
        System.out.println("");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("[" + nums[i] + "]");           
        }             
    }
    
}
