
public class Main{
    public static void main(String[] args){

        Product product = new Product("Twix",100);
        Bottle bottle = new Bottle("aqua",75,1.5);
        

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(product);
        vendingMachine.addProduct(bottle);

        System.out.println(product);
        System.out.println(bottle);
    }
}