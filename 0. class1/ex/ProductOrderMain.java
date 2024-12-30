package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;

        products[0] = product1;
        products[1] = product2;
        products[2] = product3;


        int total = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.println("상품명: " + products[i].productName + ", 가격: " + products[i].price + ", 수량: " + products[i].quantity);

            total += (products[i].price * products[i].quantity);
        }

        System.out.println("총 결제금액: " + total);


    }
}
