import javafx.util.Pair;

import java.util.*;

public class Island {

    private int id;
    private int population;
    private int migrationSize;
    private int migrationFrequency;
    //added
    ArrayList<Point> locations;
    ArrayList<ArrayList<Double>> adjMatrix;



    public Island() {
    }


    public Island(int population, int migrationSize, int migrationFrequency, ArrayList<ArrayList<Double>> adjMatrix) {
        this.population = population;
        this.migrationSize = migrationSize;
        this.migrationFrequency = migrationFrequency;
        this.locations = new ArrayList<>();
        quater(population, this.locations);
        this.adjMatrix = adjMatrix;
        distanceMatrix(this.locations, this.adjMatrix);

    }

    public Island(int population) {
        this.population = population;
        this.migrationSize = 1;
        this.migrationFrequency = 1;
    }

    public int getId() {
        return id;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public String toString() {
        return "Island{" +
                "id='" + id +
                ", population=" + population +
                '}';
    }

    public ArrayList<Point> getLocations() {
        return locations;
    }

    public ArrayList<ArrayList<Double>> getAdjMatrix() {
        return adjMatrix;
    }

    //metoda do kwaterowania mieszkańców na wyspie
    private void quater(int population, ArrayList<Point> list) {
        Random randInt = new Random();
        for (int i = 0; i < population; i++) {
            Point location = new Point(randInt.nextInt(100), randInt.nextInt(100));
            list.add(location);
        }
    }

    //tworzenie macierzy adjascencji
    private void distanceMatrix(ArrayList<Point> list, List<ArrayList<Double>> matrix) {


        for (int i = 0; i < list.size(); i++) {
            ArrayList<Double> tmp = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                tmp.add(list.get(i).distance(list.get(i), list.get(j)));
            }
            System.out.println("tmp: " + tmp.size());
            matrix.add(tmp);
            System.out.println("matrix: " + matrix.size());
            //tmp.clear();
            System.out.println("tmp2: " + tmp.size());
        }
        //System.out.println(matrix.get(0).get(0));
        //System.out.println(matrix.);
    }


}
