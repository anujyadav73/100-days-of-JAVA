package ArrayTute;

public class ReverseMethod {

    public static void reverse(int numbers[]){
        int first = 0 , last = numbers.length - 1 ;

        while(first < last){
            //Swapping the values
            int temp = numbers[last];
            numbers[last] = numbers[first] ;
            numbers[first] = temp ;

            first ++ ;            // this increases first by value of 1
            last -- ;             // this decreases last by value of 1
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);

        for (int i = 0 ; i< numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
