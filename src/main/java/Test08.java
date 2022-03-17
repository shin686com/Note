import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[]=new int[3];
        for(int i = 0 ; i < 3 ; i++) {
            arr[i]=rand.nextInt(7);
        }
        if(arr[0] == arr[1] && arr[0] == arr[2] && arr[1] == arr[2])
        {
            System.out.print(10000+(arr[0]*1000));
        }
        else if(arr[0] == arr[1] || arr[0] == arr[2])
        {
            System.out.print(1000+(arr[0]*100));
        }
        else if(arr[1] == arr[2])
        {
            System.out.print(1000+(arr[1]*100));
        }
        else
        {
            System.out.print((Math.max(arr[0], Math.max(arr[1], arr[2]))*100));
        }
    }
}
