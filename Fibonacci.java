public class Fibonacci 
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
		int max = 15;
		
		// create the array to hold the sequence of Fibonacci numbers
		int[] sequence = new int[15];
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 0;
		sequence[1] = 1;
		
		//create the Fibonacci sequence and store it in int[] sequence
		int num1 = 0;
		int num2 = 1;
	    for(int j = 2; j < 15; j++)
	    {
	         int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            sequence[j] = num3;
	         
	    }
		
		//print the Fibonacci sequence numbers
        System.out.println("The first 15 elements in the Fibonacci sequence are: ");
        for(int i = 0; i < sequence.length; i++)
        {
            System.out.print(sequence[i] + " ");
        }
    
    
    
        System.out.println("\nThe element after 55 is " + findNextElement(sequence, 55));
    }
    
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {
        for(int k = 0; k < arr.length; k++)
        {
            int temp = arr[k];
            if(temp == toFind)
            {
                temp = temp + arr[k-1];
                return temp;
            }
        }
        return -1;
        
    }
}
