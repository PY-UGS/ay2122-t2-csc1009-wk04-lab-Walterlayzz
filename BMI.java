public class BMI {
    private double weight;
    private double height;
    private double BMIvalue;

    public BMI(double weight, float height){
        this.weight = weight * 0.45359237;
        this.height = height * 0.0254;
        this.BMIvalue = this.weight / (this.height * this.height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMIvalue() {
        return BMIvalue;
    }

    public void setBMIvalue(double BMIvalue) {
        this.BMIvalue = BMIvalue;
    }

    public void BMIRange(double BMIval){
        if (BMIval < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMIval < 25.0) {
            System.out.println("Normal");
        }
        else if (BMIval < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
