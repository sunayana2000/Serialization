public class HouseConstruction {
    public static void main(String material) {
        String.format("The house material : %s",material);
    }
    public void House(String material,double area) {
        double totalarea;
        String s1="standard";
        String s2="above standard";
        String s3="highly standard";
        String s4="highly equiped";
        if(material.equals(s1)) {
            boolean automated = false;
            totalarea = area * 1200;
            System.out.format("The total area of house : %.2f square feets \n",totalarea);
            System.out.format("The house is automated : %b \n",automated);
        } else if(material.equals(s2)) {
            boolean automated = false;
            totalarea = area * 1500;
            System.out.format("The total area of house : %.2f square feets \n",totalarea);
            System.out.format("The house is automated : %b \n",automated);
        } else if(material.equals(s3)) {
            boolean automated = false;
            totalarea = area * 1800;
            System.out.format("The total area of house : %.2f square feets \n",totalarea);
            System.out.format("The house is automated : %b \n",automated);
        } else if(material.equals(s4)) {
            boolean automated = false;
            totalarea = area * 2500;
            System.out.format("The total area of house : %.2f square feets \n",totalarea);
            System.out.format("The house is automated : %b \n",automated);
        } else {
            System.out.format("Material not found ");
        }
    }
}
