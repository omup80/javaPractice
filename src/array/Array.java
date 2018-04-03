package array;

import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
public class Array {

public void array(){
    int [] array = getArray();
    System.out.println("Printing array.Array Before Sort");
    printArray(array);
    System.out.println();
    System.out.println("Sorted array.Array");
    array =  sortIntegers(array);
    printArray(array);
}


private int[] getArray(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number Of element in array.Array");
    int numberOfElement = scanner.nextInt();
    System.out.println("Enter "+ numberOfElement+ " element of array.Array");
    int [] array  = new int[numberOfElement];
    for(int i=0;i< numberOfElement;i++){
        array[i] = scanner.nextInt();
    }

    return  array;
}
private  int [] sortIntegers(int [] array){

    for(int i = 0; i<array.length;i++){
       for(int j=i+1; j<array.length;j++){
          if(array[i] < array[j]){
              int temp = array[i];
              array[i] = array[j];
              array[j] = temp;
          }

       }
    }

    return array;
}

private void printArray(int [] array){
    System.out.println();

    System.out.println();
    for(int i=0;i<array.length;i++){
        System.out.print(" "+array[i]);
    }
}

}
