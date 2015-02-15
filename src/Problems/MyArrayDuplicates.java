package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
 
public class MyArrayDuplicates {
 
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr); //Convert string array to tmplist.
        //create a treeset with the list, which eliminates duplicates
        TreeSet<String> unique = new TreeSet<String>(tmpList); //create TreeSet from List
        System.out.println(unique);
    }
}
