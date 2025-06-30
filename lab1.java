import java.util.Scanner;

public class lab1 {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    public static void findClosestTwoPoints(double[][] points) {
        int p1 = 0, p2 = 1;
        double minDistance = distance(points[p1][0], points[p1][1],
                                      points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = distance(points[i][0], points[i][1],
                                    points[j][0], points[j][1]);

                if (d < minDistance) {
                    minDistance = d;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",
                          points[p1][0], points[p1][1],
                          points[p2][0], points[p2][1]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numPoints = input.nextInt();

        double[][] points = new double[numPoints][2];

        System.out.print("Enter " + numPoints + " points: ");
        for (int i = 0; i < numPoints; i++) {
            points[i][0] = input.nextDouble(); 
            points[i][1] = input.nextDouble();
        }
        findClosestTwoPoints(points);
    }
}
