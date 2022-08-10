package multithreading;

import java.util.Optional;

public class OptionalUse {

    public static void main(String[] args) {


        Optional<String> optionalString=Optional.of("Hello World");
        System.out.println(optionalString);
        System.out.println(optionalString.get());
        Optional<String> word=getWords();
        System.out.println(word);
        System.out.println(word.get());
    }

    private static Optional<String> getWords() {
        String[] str=new String[10];
        Optional<String> op=Optional.ofNullable(str[0]);
        if (op.isPresent())
        {
            return op;
        }else
            return Optional.empty();

    }
}
