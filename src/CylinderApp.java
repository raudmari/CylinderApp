public class CylinderApp {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, true, 10);
        System.out.println("Silindri põhjapindala on: " + cylinder.getSurfaceArea());
        System.out.println("Silindri külgpindala on: " + cylinder.getSideArea());
        System.out.println("Silindri täispindala on: " + cylinder.getFullArea());
        System.out.println("Silindri ruumala on: " + cylinder.getVolume());

    }

}
