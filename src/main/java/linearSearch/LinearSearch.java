package linearSearch;

public class LinearSearch {

    public int search(int[] intArray, int number){
        for(int i = 0; i < intArray.length; i++){
            if(number == intArray[i]){
                System.out.println("Element Found on position : "+ i);
                return number;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
