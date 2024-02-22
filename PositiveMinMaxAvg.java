public class PositiveMinMaxAvg {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("There are no arguments");
        } else {
            int check = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            for (int i = 0; i < args.length; i++) {
                double val = Double.parseDouble(args[i]);
                if (val > 0) {
                    check += 1;

                    if (val < min) {
                        min = val;
                    }

                    if (val > max) {
                        max = val;
                    }
                }
            }
            if (check < 2) {
                System.out.println("Not enough postive arguments"); 
            } else {
                System.out.println((min + max)/2);
            }
        }
    }
}