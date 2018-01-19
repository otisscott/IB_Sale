import java.util.ArrayList;

class SalesPerson  {
        private String id;
    private ArrayList<Sales> salesHistory = new ArrayList<>();
    private int count;
    private static ArrayList<SalesPerson> salesPeople = new ArrayList<>();
    public SalesPerson(String ident) {
        id = ident;
        count = 0;
        salesPeople.add(this);

    }
    public int getCount(){
        return count;
    }
    public String getld() {
        return id;
    }
    public void setSalesHistory(Sales s) {
        salesHistory.add(s);
        count = count + 1;
    }
    public ArrayList<Sales> getSalesHistory() {
        return salesHistory;
    }
    public Sales getSalesHistory(int whichSale) {
        return salesHistory.get(whichSale);
    }
    public double calcTotalSales() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = total + salesHistory.get(i).getValue();
        }
        return total;
    }
    public Sales largestSale() {
        Sales largest = salesHistory.get(0);
        for (int i = 0; i < count + 1; i++) {
            if(salesHistory.get(i).getValue() > largest.getValue()) {
                largest = salesHistory.get(i);
            }
        }
        return largest;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[6];
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[1].getSalesHistory(0).getValue());
        System.out.println(salesPeople[0].calcTotalSales());

    }
}

