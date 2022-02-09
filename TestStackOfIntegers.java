import java.util.Scanner;

public class TestStackOfIntegers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int capacity = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers(capacity);
        //Obtain input of values based on capacity/size
        System.out.print("Enter the integers: ");
        for(int i = 0; i < capacity; i++){
            int value = input.nextInt();
            stack.push(value);
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
