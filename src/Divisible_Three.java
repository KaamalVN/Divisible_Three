import java.util.Scanner;

public class Divisible_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
            if(array[i]!=0 && array[i]%3==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
