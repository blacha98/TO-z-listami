import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> aMatrix = new ArrayList<ArrayList<Double>>();
        Island isl = new Island(5, 4, 4, aMatrix);
        ArrayList<Point> list = new ArrayList<Point>();
        list = isl.getLocations();
        list.forEach(point -> System.out.println(point.toString()));
        Point A = list.get(0);
        Point B = list.get(1);
        double x = A.distance(A, B);
        System.out.println(x);
//        for(int i=0; i<isl.getPopulation(); i++){
//            for(int j = 0; j<isl.getPopulation(); j++){
//                //System.out.print(isl.getAdjMatrix().get(i).get(j));
//                //System.out.println("  ");
//            }
//            //System.out.println();
//        }
        ArrayList<ArrayList<Double>> adjMatrix = isl.getAdjMatrix();
        System.out.println(adjMatrix.get(2).get(1));
        ArrayList<ArrayList<Double>> mat = new ArrayList<>();
        //System.out.println(mat.get(0).get(0));


    }
}
