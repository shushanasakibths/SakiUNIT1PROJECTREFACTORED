public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage / 100;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        if (cost != -1) {
            totalBillBeforeTip += cost;
        }
    }

    public double tipAmount() {
        return totalBillBeforeTip * tipPercentage;
    }

    public double totalBill() {
        return (totalBillBeforeTip + (totalBillBeforeTip * tipPercentage));
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }

}




