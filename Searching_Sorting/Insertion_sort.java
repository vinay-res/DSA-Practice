public class Insertion_sort
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

     for(int i=1;i<arr.length;i++)
     {
       for(int j=i-1;j>=0;j--)
       {
         if(arr[j]>arr[j+1])
         swap(arr,j,j+1);
         else
         break;
       }
     }

     for(int val:arr)
        System.out.println(val);
  

  }

    
  }
