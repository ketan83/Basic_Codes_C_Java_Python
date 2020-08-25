import java.util.Scanner;

class program5 {

        public static void main(String[] args) {

                int i ,n=5,avg=0 ,y,  x =12345;

                for(i=1 ; i<=n; i++) {

                        y = (12345%10);

                        avg = avg + y;

                }

                avg = avg/n;
                System.out.println("Average of digits from the number"+avg);
        }
}
               
