
public class Quicksort
{
    public  static void Sort(int arr[],int l,int h)
     {
        if(l>=h)
        return;

        int pivot=arr[h];
        int p=part(arr,pivot,l,h);
        Sort(arr,l,p-1);
        Sort(arr,p+1,h);






    }

    public  static int part(int arr[],int pivot,int l,int h)
     {
        int i=l;
        int j=l;

        while(i<=h)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;

            }
            else
            i++;



        }


        return (j-1);



    }
    public static void main(String[]args)
    {
        int arr[]={100,98,1001,946,1002};
        int l=0;
        int h=arr.length-1;
        Sort(arr,l,h);

        for(int val:arr)
        {
            System.out.println(val);
        }



    }
}

