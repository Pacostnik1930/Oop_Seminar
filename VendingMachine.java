import java.util.ArrayList;
import java.util.List;
public class VendingMachine {
    private List<Product> productList;
    public VendingMachine(List<Product> productList){
        this.productList = productList;
    }
    public VendingMachine(){
        this(new ArrayList<>());

    }
    public void addProduct(Product product){
        productList.add(product);
    }
}
