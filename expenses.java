import java.util.Scanner;

import static java.lang.System.*;


public class expenses {


    public static void main(String[] args) {
        double div = 0;
        int k = 0, j = 0;
        double sum1=0;
        double ea[] = new double[100];
        double eqi[] = new double[100];
        double sum = 0;
        Scanner scan = new Scanner(in);
        String[] fname = new String[100];
        Scanner scan2=new Scanner(in);
        out.println("Enter number of person");
        int n=scan2.nextInt();
        while (j < n) {
            String[] ch = new String[]{"first", "second", "third", "fourth"};
            out.println("Enter " + ch[j] + " person name");
            fname[j] = scan.nextLine();
            Scanner scan1 = new Scanner(in);
            out.println("Enter all the expenses");
            sum1=0;
            int i = 0;
            double f1[] = new double[100];
            while (i <= 1) {
                f1[i] = scan1.nextDouble();
                sum1 = sum1 + f1[i];
                i++;
            }
            sum = sum1 + sum;
            out.println("The total sum of expenses of " + fname[j] + ": " + sum1);
            ea[j] = sum1;
            j++;
        }
        div = sum / n;
        out.println("Total expenses: " + sum);

        out.println("Each person will be: " + div);

        for(j=0;j<n;j++){
            eqi[j] = ea[j] -div;
            if (eqi[j]<0){
                out.println(fname[j]+ " has to pay "+eqi[j]);
            }else if(eqi[j]==0){
                out.println(fname[j]+" does not need to pay or get paid");
            }else
                out.println(fname[j]+ " has to get paid "+eqi[j]);
            }
    }

}
