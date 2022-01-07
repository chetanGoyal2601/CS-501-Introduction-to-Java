public class C4E3EstimateAreas {
    public static void main(String[] args) {
        final double RADIUS = 6371.01; //radius of Earth
        System.out.println("Through this program, we will determine the area enclosed by four cities- Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina.");
        System.out.println("We will use their GPS location to determine the distances between them and since they form a polygon, we will use the distance between Atlanta and Savannah as a diagonal cutting this polygon into two triangles.");
        System.out.println("Then we will add up the areas of the two triangles to get the required area.");

        //Latitudes and longitudes of all the cities
        double latAtlanta = Math.toRadians(33.753746);
        double longAtlanta = Math.toRadians(-84.386330);
        double latOrlando = Math.toRadians(28.538336);
        double longOrlando = Math.toRadians(-81.379234);
        double latSavannah = Math.toRadians(32.076176);
        double longSavannah = Math.toRadians(-81.088371);
        double latCharlotte = Math.toRadians(35.227085);
        double longCharlotte = Math.toRadians(-80.843124);

        //Getting distances between the cities to determine the length of the sides of the triangle
        double dAtlantatoOrlando = RADIUS * Math.acos(Math.sin(latAtlanta) * Math.sin(latOrlando) + Math.cos(latAtlanta) * Math.cos(latOrlando) * Math.cos(longAtlanta - longOrlando)); //side1
        System.out.println("\nThe distance between Atlanta and Orlando (side1 of the polygon) is: " + dAtlantatoOrlando + " km");
        double dOrlandoToSavannah = RADIUS * Math.acos(Math.sin(latOrlando) * Math.sin(latSavannah) + Math.cos(latOrlando) * Math.cos(latSavannah) * Math.cos(longOrlando - longSavannah)); //side2
        System.out.println("The distance between Orlando and Savannah (side2 of the polygon) is: " + dOrlandoToSavannah + " km");
        double dSavannahToCharlotte = RADIUS * Math.acos(Math.sin(latSavannah) * Math.sin(latCharlotte) + Math.cos(latSavannah) * Math.cos(latCharlotte) * Math.cos(longSavannah - longCharlotte)); //side3
        System.out.println("The distance between Savannah and Charlotte (side3 of the polygon) is: " + dSavannahToCharlotte + " km");
        double dCharlotteToAtlanta = RADIUS * Math.acos(Math.sin(latCharlotte) * Math.sin(latAtlanta) + Math.cos(latCharlotte) * Math.cos(latAtlanta) * Math.cos(longCharlotte - longAtlanta)); //side4
        System.out.println("The distance between Charlotte and Atlanata (side4 of the polygon) is: " + dCharlotteToAtlanta + " km");
        double dAtlantaToSavannah = RADIUS * Math.acos(Math.sin(latAtlanta) * Math.sin(latSavannah) + Math.cos(latAtlanta) * Math.cos(latSavannah) * Math.cos(longAtlanta - longSavannah)); //diagonal
        System.out.println("The distance between Atlanta and Savannah (diagonal for the polygon) is: " + dAtlantaToSavannah + " km");

        //Calculating area of triangle 1
        double sA = (dAtlantatoOrlando + dOrlandoToSavannah + dAtlantaToSavannah) / 2;
        double areaA = Math.pow((sA * (sA - dAtlantatoOrlando) * (sA - dOrlandoToSavannah) * (sA - dAtlantaToSavannah)), 0.5);
        System.out.println("\nThe area of the triangle formed by Atlanta, Orlando and Savannah is: " + areaA + " squarekm");

        //Calculating area of tiangle 2
        double sB = (dCharlotteToAtlanta + dSavannahToCharlotte + dAtlantaToSavannah) / 2;
        double areaB = Math.pow((sB * (sB - dCharlotteToAtlanta) * (sB - dSavannahToCharlotte) * (sB - dAtlantaToSavannah)), 0.5);
        System.out.println("The area of the triangle formed by Atlanta, Charlotte and Savannah is: " + areaB + " squarekm");

        //Adding areas of the triangle to get  the area of the polygon
        double area = areaA + areaB;
        System.out.println("\nHence, the total area is: " + area + " squarekm");
    }
}