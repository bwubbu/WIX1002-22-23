package Finals;

abstract class Fruit {                                  // name of abstract class
    String name;                                        // field for name of fruit
    String type;                                        // field for type of fruit
    
    Fruit (String name, String type) {                  // constructor
        this.name = name;
        this.type = type;
    }
    
    abstract double totalPrice();                       // abstract method
    
    @Override
    public String toString() {                          // method that returns
        return "Fruit type :" + type + " Fruit name :" + name;
    }
    public static void main(String[] args) {            // Tester class
        
        Fruit[] a = new Fruit[4];                       // Define array to hold onto value
        a[0] = new Apple("Red apple", 8);
        a[1] = new Apple("Green apple", 11);
        a[2] = new Watermelon("Local Watermelon", 7.6);
        a[3] = new Watermelon("Imported Watermelon", 4);
        
        double cheapest = Integer.MAX_VALUE;
        Fruit cheap = null;                             // Placeholder to input the cheapest fruit
        
        for (int i = 0; i < a.length; i++) {            // i starts with 0, if i is less than the array (which is 4), loop and increment i by 1.
            System.out.println(a[i].toString());      // prints out the array into a string value
            if (cheapest > a[i].totalPrice()) {         // compares cheapest price with prices of the items
                cheap = a[i];
            }
        }
        System.out.println("The cheapest item is ");
        System.out.print(cheap.toString());
    }
    
    static class Apple extends Fruit {                  // name of class and extends to abstract
        public int apple_quantity;                      // field for quantity of apples
        public final double red = 1.80;                 
        public final double green = 1.20;               
        
        public Apple(String type, int quan){            // constructor
            super("",type);
            this.apple_quantity = quan;
        }
        
        @Override
        public double totalPrice() {
            if (type.contains("Green")) {
                return green*apple_quantity;
            }
            else {
                return red*apple_quantity;
            }
        }
        
        @Override
        public String toString() {
            return name + " " + type + " - " + this.apple_quantity + " = RM " + totalPrice() + "\n";
        }
    }
    
    static class Watermelon extends Fruit {
        double kgW;
        
        public Watermelon(String type, double kgW) {
            super("",type);
            this.kgW = kgW;
        }
        
        @Override
        public double totalPrice() {
            double price;
            if(type.contains("Local")) {
                if (kgW < 2){
                    return price = kgW*2.25;
                }
                else if (kgW >= 2 && kgW <= 5) {
                    return price = kgW*1.95;
                }
                else
                    return price = kgW*1.65;
            }
            else{
                if (kgW < 2) {
                    return price = kgW*3.75;
                }
                else if (kgW >= 2 && kgW <= 5) {
                    return price = kgW*3.45;
                }
                else
                    return price = kgW*3.15;
            }
        }   
        
        @Override
        public String toString() {
            return name + " " + type + " - " + this.kgW + " kg" + " = RM " + totalPrice() + "\n";
        }
    }
}



