package multithreading;

import java.util.ArrayList;
import java.util.List;

public class SafeArgs {

    private void print(List... names)
    {
        for (List<String> name:names
             ) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {

SafeArgs safeArgs=new SafeArgs();

List<String> list=new ArrayList<>();
list.add("Syed");
list.add("Bob");
list.add("Jenny");
        safeArgs.print(list);
    }
}
