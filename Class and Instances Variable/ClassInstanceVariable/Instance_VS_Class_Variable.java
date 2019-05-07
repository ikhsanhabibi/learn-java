package ClassInstanceVariable;


class Product {
    public int barcode;
}


public class Instance_VS_Class_Variable {
    public static void main(String[] args) {

        Product prod1 = new Product();
        prod1.barcode = 123456;

        Product prod2 = new Product();
        prod2.barcode = 987654;

        System.out.println(prod1.barcode);
        System.out.println(prod2.barcode);
    }
}



//Class variables:
//class Product {
//    public static int barcode;
//    
//    public int getBarcode() {
//        return barcode;
//    }
//    
//    // first 123456
//    // then 987654
//    public void setBarcode(int value){
//        barcode = value;
//    }
//
//}
//
//public class Instance_VS_Class_Variable {
//    public static void main(String[] args) {
//
//        Product prod1 = new Product();
//        prod1.setBarcode(123456);
//        Product prod2 = new Product();
//        prod2.setBarcode(987654);
//
//        System.out.println(prod1.getBarcode());
//        System.out.println(prod2.getBarcode());
//    }
//}


