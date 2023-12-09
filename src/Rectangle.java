public class Rectangle extends Form{
    private double base = 10;
    private double height = 6;
    private double areaRectangle = base * height;

    @Override
    public void areaCalculator() {
        System.out.println("Rectangle area is equal to: " + areaRectangle);
    }
}
