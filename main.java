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
    public static void mergesort(int[] arr,int l,int h)
    {
        if(l>=h)
        {
            return;
        }
        int mid=l+(h-l)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, h);
        merge(arr,l,mid,h);
    }
    public static void merge(int[] arr,int l,int mid,int h)
    {
        int p1=l;
        int p2=mid+1;
        int k=0;
        int[] temp=new int[h-l+1];
        while(p1<=mid && p2<=h)
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
        while (p2<=h) {
            temp[k++]=arr[p2++];
        }
        for(int i=l;i<=h;i++)
        {
            arr[i]=temp[i-l];
        }
    }
 }