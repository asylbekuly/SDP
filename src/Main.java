import java.util.FormatFlagsConversionMismatchException;

class FoodProduct implements inter {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double discountPrice() {
        return price*0.1;
    }

}

class ElectronicsProduct implements inter{
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double discountPrice() {
        return price * 0.05;
    }
}
class ClothingProduct implements inter{
    public double price;
    public ClothingProduct(double price){
        this.price=price;
    }
    @Override
    public double discountPrice() {
        return price * 0.2;
    }
}



class Main {
    public static void main(String[] args) {
        inter Food = new FoodProduct(100);
        inter Electro = new ElectronicsProduct(100);
        inter Clothing = new ClothingProduct(100);
        System.out.println("Food product discount: " + Food.discountPrice());
        System.out.println("Electro product discount: " + Electro.discountPrice());
        System.out.println("Clothing product discount: "+ Clothing.discountPrice());

    }
}
