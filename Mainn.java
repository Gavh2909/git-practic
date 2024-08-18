

import java.util.*;

class Mainn{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,22,3,4,5,6,76));
        int k = 11;

        for(int i=0;i<list.size()-1;i++){
            if(k-list.get(i)==list.get(i+1)){
                // System.out.println("Res: "+list.get(i)+":"+list.get(i+1));
            }
        }
        

        String name = "Satish";

        String newName = "";
        for(int i=name.length()-1;i>=0;i--){
            newName+=name.charAt(i);
        }

        System.out.println(newName);

        // list.stream().filter(i-> i.equals(k-i))

        
        // for(int n: list){
        //     if(list.contains(k-n)){
        //         System.out.println(n+" ");
        //         System.out.println(k-n+" ");
        //     }
        // }
    }
}


// hashcode and equals contract
// hashing
// reverse string optimal
// SQL query


/**
 * 
 * Table name - employee

Columns

emp_id

dept_id

name

salary

 

Write a query to get highest salary of each dept




Program - From a list of  number with duplicates idenity pair of two adjoining number whose sum is equal to given number
 */