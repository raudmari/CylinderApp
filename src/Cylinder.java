public class Cylinder extends Circle {
    private double height;

    /**
     * @param radius   objekti tegemisel kaasa andtud ringi raadius
     * @param isRadius true on raadius ja false on diameeter
     */
    public Cylinder(double radius, boolean isRadius, double height) {
        super(radius, isRadius);
        this.height = height;
        Double sideArea = getPerimeter() * getHeight();
        Double surfaceArea = getArea() * 2;
        Double fullArea = sideArea + surfaceArea;
    }

    public double getHeight() {
        return height;
    }

    public double getSideArea() {
        return Math.round((getPerimeter() * getHeight()) * 100 /100) ;
    }

    public double getSurfaceArea() {
        return Math.round((getArea() * 2) * 100 / 100) ;
    }

    public double getFullArea(){
        return Math.round((getSideArea() + getSurfaceArea()) * 100 / 100) ;
    }

    public double getVolume() {
        return Math.round((getArea() * getHeight()) * 100 / 100);
    }




}

