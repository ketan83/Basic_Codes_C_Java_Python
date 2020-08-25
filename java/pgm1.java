import java.util.*;

  class Main2

{

public static void main(String[] args) {

 Scanner s = new Scanner(System.in);

 int D = s.nextInt();

 int P = s.nextInt();

 int part = D/P;

 int count = 0;

 int test[] = new int[P];

 boolean divisible = D%P == 0;

  if(divisible){

         ArrayList<Integer> arr = findPrime(2,part);

         for(int i=0 ;i < arr.size(); i++){

             test[0] = arr.get(i);

             for(int j=1 ; j<P; j++){

                 if(isPrime(test[j-1] + part)){

                 test[j] = test[j-1] + part;

                     if(j == P-1)

                       count ++;

                 }

             }

         }

  System.out.print(count);

  }

   
}
}

static ArrayList<Integer> findPrime(int low, int high){

    ArrayList<Integer> a = new ArrayList<Integer>();

     while (low <= high) {

           if(isPrime(low))

            a.add(low);

           

            ++low;

       }

     return(a);

}

static  boolean isPrime(int num) {

        boolean flag = false;

           for(int i = 2; i <= num/2; ++i) {

       

               if(num % i == 0) {

                   flag = true;

                   break;

               }

           }

           if (!flag)return true;

           return false;

           

}

}
