import java.util.ArrayList;

public class Quickstats {
    public static void main(String[] args) {
        ArrayList<String> listArgs = new ArrayList<String>();

        if (args.length != 0) {
            for(String arg: args) {
                listArgs.add(arg);
            }
        }

        System.out.println(listArgs);
    }
}