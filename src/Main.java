import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number,total=0;
        boolean check = true;
        do {
            System.out.println("Enter a Number : ");
            number= sc.nextInt();
            if (number%2==1){
                check=false;
            }
            else if (number%4==0){
                total+=number;
            }

        } while (check);
        System.out.println("TotalNumber= "+total);
    }
}