class Sales // each object contains details of one sale
{
    private String itemid; // id of the item
    private double value;
    private int quantity;
    public Sales(String id, double val, int quant) {
        quantity = quant;
        value = val;
        itemid = id;
    }
    public double getValue() {
        return value;
    }
    public int getQuantity() {
        return quantity;
    }
}