import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> passingList;
    private ArrayList<Integer> gradeList;

    public Points() {
        this.pointsList = new ArrayList<>();
        this.passingList = new ArrayList<>();
        this.gradeList = new ArrayList<>();
    }

    public void addPoints(int points) {
        this.pointsList.add(points);
        if(points >= 50) {
            passingList.add(points);
        }
        gradeList.add(grade(points));
    }

    public double average(ArrayList<Integer> list) {
        if(list.isEmpty()) {
            return -1.0;
        }
        int total = 0;
        int counter = list.size();
        for(int point: list) {
            total += point;
        }
        return (1.0*total)/counter;
    }

    public double averageAll() {
        return average(this.pointsList);
    }

    public double averagePassing() {
        return average(this.passingList);
    }

    public double passingPercentage() {
        double returnValue = (100.0 * passingList.size())/pointsList.size();
        return returnValue;
    }

    public int grade(int points) {
        if(points < 50) {
            return 0;
        }else if(points < 60) {
            return 1;
        }else if(points < 70) {
            return 2;
        }else if(points < 80) {
            return 3;
        }else if(points < 90) {
            return 4;
        }else{
            return 5;
        }
    }

    public ArrayList<Integer> gradeList() {
        return gradeList;
    }
}
