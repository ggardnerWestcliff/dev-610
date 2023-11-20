package assignments.week4.chapter9;

// Represents financial assets that investors hold.
public interface Asset {
    // how much the asset is worth
    public double getMarketValue();
    // how much money has been made on this asset
    public double getProfit();
}
