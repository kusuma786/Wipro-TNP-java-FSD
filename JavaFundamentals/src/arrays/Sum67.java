package arrays;

public class Sum67 {

    public static void main(String[] args) {


        int[] arr = {10,3,6,1,2,7,9};


        int sum = 0;

        boolean ignore = false;


        for(int num : arr) {


            if(num == 6)

                ignore = true;


            else if(ignore && num == 7)

                ignore = false;


            else if(!ignore)

                sum += num;
        }


        System.out.println(sum);
    }
}