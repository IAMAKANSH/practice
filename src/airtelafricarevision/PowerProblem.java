package airtelafricarevision;

public class PowerProblem {

    public static void main(String[] args) {
        Object[] list1={3};
        //Object[] list2={7,list1,2};
        Object[] list={1,2,list1};
        //3+
        System.out.println(list);
        int power=1;
        int sum=powerSum(list,1);
        System.out.println(sum);
    }

    private static int powerSum(Object[] list, int power) {
        int sum=0;
        for (Object obj:list)
        {
            if(obj instanceof Integer)
            {
                sum +=((Integer) obj).intValue();
            }
            else
            {
                sum +=powerSum((Object[]) obj,power+1);
            }
        }
        return (int) Math.pow(sum,power);
    }
}
