public class Selection_sort
{

  public static void swap(int arr[],int i,int j)
  {
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;

  }



  public static void main(String[]args)
  { 
    int arr[]={1,0};

    for(int i=0;i<arr.length-1;i++)
    {
      int min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
            min=j;
        }

        swap(arr,i,min);

    }

    for(int val:arr)
   System.out.println(val);



  }
  
  


}