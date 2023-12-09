public class Triangle extends Form{
    private double base = 8;
    private double height = 5;
    private double areaTriangle = (base * height) / 2;

    @Override
    public void areaCalculator() {
        System.out.println("Triangle area is equal to: " + areaTriangle);
    }
}
