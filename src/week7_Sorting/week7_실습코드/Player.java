package problem_solving.week7;

public class Player {
    String id;
    double record;
    public Player(String id, double record) {
        this.id=id;
        this.record=record;
    }
    @Override
    public String toString() {
        return "("+id+","+record+")";
    }
}
