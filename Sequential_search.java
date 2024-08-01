import java.util.Scanner;

class SequentialSearch 
{
    public static int search(int arr[], int N, int x)
    
    {
        for (int i = 0; i < N; i++) 
        {
            if (arr[i] == x)
                return i;
                
        }
        return -1;
    }
    
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element to search: ");
        int x = scanner.nextInt();
        scanner.close();
    
        int arr[] = {2, 3, 4, 10, 40};
        
        
        int result = search(arr, arr.length, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index: " + result);
    }
}