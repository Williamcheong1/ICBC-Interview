public class Supermarket {

    // 水果價格
    private static final double apple_price = 8.0;
    private static final double strawberry_price = 13.0;
    private static final double mango_price = 20.0;

    // 草莓打折
    private static final double strawberry_discount = 0.8;

    // 滿減
    private static final double boundary_amount = 100.0;
    private static final double discount_amount = 10.0;

    // Question 1
    public double calculateA(int appleWeight, int strawberryWeight) {
        return appleWeight * apple_price + strawberryWeight * strawberry_price;
    }

    // Question 2
    public double calculateB(int appleWeight, int strawberryWeight, int mangoWeight) {
        return appleWeight * apple_price + strawberryWeight * strawberry_price + mangoWeight * mango_price;
    }

    // Question 3
    public double calculateC(int appleWeight, int strawberryWeight, int mangoWeight) {
        double total = appleWeight * apple_price + (strawberryWeight * strawberry_price * strawberry_discount) + mangoWeight * mango_price;
        return total;
    }

    // Question 4
    public double calculateD(int appleWeight, int strawberryWeight, int mangoWeight) {
        double total = appleWeight * apple_price + strawberryWeight * strawberry_price + mangoWeight * mango_price;
        if (total >= boundary_amount) {
            total -= discount_amount;
        }
        return total;
    }

    //以下水果斤數數值自行修改
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        
        double totalA = supermarket.calculateA(3, 2);
        System.out.println("顾客 A 的总价: " + totalA + " 元");

        double totalB = supermarket.calculateB(3, 2, 1);
        System.out.println("顾客 B 的总价: " + totalB + " 元");

        double totalC = supermarket.calculateC(3, 2, 1);
        System.out.println("顾客 C 的总价: " + totalC + " 元");

        double totalD = supermarket.calculateD(3, 2, 1);
        System.out.println("顾客 D 的总价: " + totalD + " 元");
    }
}