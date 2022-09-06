public class Bubblesort
 {

    public static void swap(int arr[],int i,int j)
    {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

    }
     public static void main(String[]args)
     {
         int arr[]={1,2,3,3,4,5};
         boolean x=true;
         for(int i=0;i<arr.length-1;i++)// loop for n-1 iterations
         
        {
            for(int j=0;j<arr.length-i-1;j++)// loop to shift greatest element remaining  on the rhs
            {
                if(arr[j]>arr[j+1])
                {
                swap(arr,j,j+1);
                x=false;

                }

             

            } 

            if(x==true)
            break;




        }

        for(int val:arr)
        System.out.println(val);

     }    
}
