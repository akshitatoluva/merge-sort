import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
    public static void mergesort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=low+(high-low)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high)
    {
        int p1=low;
        int p2=mid+1;
        int k=0;
        int[] temp=new int[high-low+1];
        while(p1<=mid && p2<=high)
        {
            if(arr[p1] < arr[p2])
            {
                temp[k++]=arr[p1++];
            }
            else{
                temp[k++]=arr[p2++];
            }
        }
        while(p1<=mid)
        {
            temp[k++]=arr[p1++];
        }
        while (p2<=high) {
            temp[k++]=arr[p2++];
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp[i-low];
        }
    }
 }