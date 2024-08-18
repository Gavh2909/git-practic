import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,22,3,4,5,6,76));
        int k = 11;
        
        for(int n: list){
            if(list.contains(k-n)){
                System.out.println(n+" ");
                System.out.println(k-n+" ");
            }
        }
    }
}

// From a list of  number with duplicates idenity pair of two adjoining number whose sum is equal to given number