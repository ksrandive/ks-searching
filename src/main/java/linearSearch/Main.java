package linearSearch;

public class Main {
    public static void main(String[] args){
        int[] intArray = {12, 22, -15, 2, 21, 15, -22};

        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(intArray, -22));
        System.out.println(linearSearch.search(intArray, -2));
    }
}
