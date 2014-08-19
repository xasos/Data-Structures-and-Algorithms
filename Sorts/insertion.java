public class Insertion {

    public static void main(String[] args) {
        int key;
        
        // populate array
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int)(Math.random() * 20));
            System.out.print("[" + nums[i] + "]");           
        }
        
        //apply insertion sort
        for (int i = 0; i < nums.length; i++) {
            int j = i; //i=2, j=2
            
            int toInsert = nums[i]; //toinsert = 5
            
            while((j>0) && nums[j-1] > toInsert) { //moves all the elements to insert lower element 
               nums[j] = nums[j-1];
               j--;
           }            
               nums[j] = toInsert;
        }
        
        //print out sorted array
        System.out.println("");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("[" + nums[i] + "]");           
        }
    }    
}
