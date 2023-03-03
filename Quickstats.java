import java.util.ArrayList;

public class Quickstats {
    public static void main(String[] args) {
        Stats stat = new Stats(args);
        System.out.println("Count: "+ stat.count());
        System.out.println("Total: "+ stat.total());
        System.out.println("Average: "+ stat.average());
    }
}

class Stats {
    private ArrayList<Integer> listArgs = new ArrayList<Integer>();

    public Stats(String[] args) {
        if (args.length != 0) {
            for(int i = 0; i < args.length; i++) {
                listArgs.add(Integer.parseInt(args[i]));
            }
        }
    }

    public int count() {
        int count = listArgs.size();
        return count;
    }

    public int total() {
        int sum = 0;

        for(int num: listArgs) {
            sum += num;
        }

        return sum;
    }

    public int average() {
        int average = 0;
        int total = total();
        int count = count();
        return total / count;
    }
}