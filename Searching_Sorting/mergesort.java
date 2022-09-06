

 class mergesort
{

  public static int[] MergeArrays(int arr1[],int arr2[]) 
  {
    int x=arr1.length ;
    int y=arr2.length;
    int ans[]=new int[x+y];
    
    int i=0,j=0,k=0;
    while(i<x && j<y)
    {
      if(arr1[i]<arr2[j])
      {
         ans[k]=arr1[i];
         i++;
         k++;
      }
      else
      {
        ans[k]=arr2[j];
        j++;
        k++;
      }
    }

    while(i<x)
    {
      ans[k]=arr1[i];
      i++;
      k++;
    }

    while(j<y)
    {
      ans[k]=arr2[j];
      j++;
      k++;
    }

    return ans;
       
  }

  public static int[] Merge(int arr[],int l,int h)
  {
    if(l==h)
    {
      int base[]=new int[1];
      base[0]=arr[h];
      return base;

    }
     int mid=(l+h)/2;
    int firsthalf[]=Merge(arr,l,mid);
    int secondhalf[]=Merge(arr,mid+1,h);
    int sorted[]= MergeArrays(firsthalf,secondhalf); 

    return sorted;
        
  }
   public static void main(String[]args) 
   {
        
    int arr[]={7,-2,4,1,3};
    int l=0;
    int h=arr.length-1;

   int ans[]=Merge(arr,l,h);
   
   

   for(int val:ans)
   {
     System.out.print(val);
     System.out.print(" ");
   }



   }
}
