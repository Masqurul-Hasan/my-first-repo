public class Car {

    private String model;
    private double price;
    
    public Car(String model, double price) {
       
        this.model = model;
        this.price = price;
    
    }
    
   
    private String getModel() {
        return model;
    }
    
    private void setModel(String model) {
        this.model = model;
    }
    
    private double getPrice() {
        return price;
    }
    
    private void setPrice(double price) {
        this.price = price;
    }
    
   
    public String toString() {
    
        return "Make of Car: "\n Model of Car: " + getModel()
                + "\n Price of Car: " + getPrice();
    
    }
    
    }