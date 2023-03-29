
public class Notebook {
    
    private String brand;
    private String model;
    private String color;
   
    public Notebook(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Notebook(){

    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }

    public String getInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s,", brand, model, color);
        return ".";
    }
}
