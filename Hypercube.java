
//Student name : Melika Sherafat
//Student ID : 218970871

package mell;
import java.util.ArrayDeque;
import java.util.Queue;


public class Hypercube {
    class Corner {
    	 int[] coords;
        public Corner(int[] coords) {
            this.coords = coords;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Corner corner = (Corner) obj;
            if (coords.length != corner.coords.length) return false;
            for (int i = 0; i < coords.length; i++) {
                if (coords[i] != corner.coords[i]) return false;
            }
            return true;
        }

        
    }

    private int n;
    private Corner[] corners;
    public Hypercube(int n) {
        this.n = n;
        corners = new Corner[(int) Math.pow(2, n)];
        generatecorners();
    }

    private void generatecorners() {
        genallcorners(new int[n], 0);
    }
    

    private void genallcorners(int currentCoords[], int index) {
        if (index == n) {
            corners[cornercount++] = new Corner(currentCoords.clone());
            return;
        }
        currentCoords[index] = 0;
        genallcorners(currentCoords, index + 1);
        currentCoords[index] = 1;
        genallcorners(currentCoords, index + 1);
    }
    private String convret(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int value : array) {
            sb.append(value);
        }
        return sb.toString();
    }

    private int cornercount = 0;

    public void recursiveWalk() {
        boolean[] visited = new boolean[corners.length];
        recrusivecorner(corners[0], visited);
    }

    private void recrusivecorner(Corner current, boolean[] visited) {
        System.out.println(convret(current.coords));
        visited[findid(current)] = true;

        boolean finish = true;
        for (int i = 0; i < n; i++) {
            int[] neighbours = current.coords.clone();
            neighbours[i] = 1 - neighbours[i];
            Corner neighbor = new Corner(neighbours);
            int neighbourid = findid(neighbor);
            if (neighbourid >= 0 && !visited[neighbourid]) {
                finish = false;
                recrusivecorner(neighbor, visited);
            }
        }

        if (finish) {
            return;
        }
    }

    private int findid(Corner corner) {
        for (int i = 0; i < corners.length; i++) {
            if (corner.equals(corners[i])) {
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        Hypercube hypercube = new Hypercube(3);
        System.out.println("Recursive Walk:");
        hypercube.recursiveWalk();

    }
}
