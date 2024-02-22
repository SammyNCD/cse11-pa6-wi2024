class Point {
    int x;
    int y;
    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    boolean belowLeftOf(Point other) {
      return this.x <= other.x && this.y <= other.y;
    }
    boolean aboveRightOf(Point other) {
      return this.x >= other.x && this.y >= other.y;
    }
    double distance(Point other) {
      return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
  }

public class ClosestPoints {
    public static void main(String[] args) {
        if (args.length % 2 != 0 || args.length < 4) {
            System.out.println("Invalid number of arugments.");
        } else {
            Point[] points = new Point[args.length / 2];
            int index = 0;
            for (int i = 0; i < args.length; i+=2) {
                Point p = new Point(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]));
                points[index++] = p;
            }
            Point p1 = points[0];
            Point p2 = points[1];
            double distance = p1.distance(p2);
            for (int i = 0; i < points.length; i++) {
                for (int j = i + 1; j < points.length; j++) {
                    if (points[i].distance(points[j]) < distance) {
                        p1 = points[i];
                        p2 = points[j];
                        distance = points[i].distance(points[j]);
                    }
                }
            }
            System.out.println("Closest points are " + "(" + p1.x + ", " + p1.y + ") " + "and " + "(" + p2.x + ", " + p2.y + ") " + "at distance " + distance);            
        }
    }
}