import java.util.Scanner;
class Main
{
  public static int binarySearch(int[] arr, int left, int right, int number)
  {
    if (left > right) 
    {
      return -1;
    }
    int mid = (left + right) / 2;
    if (number == arr[mid]) 
    {
      return mid;
    }
    else if (number < arr[mid]) 
    {
      return binarySearch(arr, left, mid - 1, number);
    }
    else 
    {
      return binarySearch(arr, mid + 1, right, number);
    }
  }
 
  public static void main(String[] args)
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of arr size ");
    n = sc.nextInt();
  
    int[] arr = new int[n];
    for(int i=0; i<n; i++)  
    {  
      System.out.print("Enter array value ");
      arr[i]=sc.nextInt();  
    }
    int number;
    System.out.print("Enter the target value: ");
    number = sc.nextInt();
    
    int left = 0;
    int right = arr.length - 1;
    int index = binarySearch(arr, left, right, number);

    if (index != -1) 
    {
      System.out.println("Element found at index " + index);
    }
    else 
    {
      System.out.println("Element not found in the array");
    }
  }
}