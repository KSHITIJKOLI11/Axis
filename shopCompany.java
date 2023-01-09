import java.util.Scanner;

public class shopCompany implements retail{

    @Override
    public double getTotalcost(int tax, int cost, int number) {
        // TODO Auto-generated method stub
        double totalcost = (cost*(1 + (tax/100)))*number;
        return totalcost;
    }

    @Override
    public double getTotalextendedcost(double cosmetics, double perfume, double clothes) {
        // TODO Auto-generated method stub
        double totalextendedcost = cosmetics + perfume + clothes;
        System.out.println("total cost: " + totalextendedcost);
        return totalextendedcost;
    }

    @Override
    public void totaldiscount(double totalcost) {
        // TODO Auto-generated method stub
        double totaldiscount = (totalcost*(0.98));
        System.out.println(" Total Discounted price" + totaldiscount);
        
    }

    public static void main(String args[]){
        
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println(" Cosmatics Number: ");
                int cosmatics = sc.nextInt();
                System.out.println("Perfume number: ");
                int perfume = sc.nextInt();
                System.out.println("clothes number: ");
                int clothes = sc.nextInt();

                shopCompany r = new shopCompany();
                double cc = r.getTotalcost(7,1000, cosmatics);
                System.out.println("Cosmetics total cost: " + cc);
                double cp = r.getTotalcost(12,5000, perfume);
                System.out.println("Perfume total cost: " + cp);
                double ccl = r.getTotalcost(4,7000, clothes);
                System.out.println("Clothes total cost: " + ccl);

                double totalcost = r.getTotalextendedcost(cc,cp,ccl);
                r.totaldiscount(totalcost);
            }
        



    }

    
}
