package airtelafricarevision;

import java.util.HashSet;

public class RepeatedNumber {

    public static void main(String[] args) {

        int[] arr={1,3,2,5,5,4};
        //0.028878601s
        System.out.println(findDuplicate(arr));
        //0.021964718s
        //System.out.println(findDuplicate1(arr));
    }

    public static Integer findDuplicate(int[] arr)
    {
        HashSet<Integer> seen=new HashSet<>();

        for (Integer ele:
             arr) {
            if (!seen.add(ele))
                return ele;
        }
        return -1;
    }

    public static Integer findDuplicate1(int[] arr)
    {
        int hare=0;
        int tortoise=0;
        while (true)
        {
            tortoise=arr[tortoise];
            hare=arr[arr[hare]];
            if (tortoise==hare)
            {
                int pointer=0;
                while (pointer!=tortoise)
                {
                    pointer=arr[pointer];
                    tortoise=arr[tortoise];
                }
                return pointer;
            }
        }


    }
}
