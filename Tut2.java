
public class Tut2 implements Tut_interface {
    @Override
    public int walk(int steps) {
        System.out.println("Total running steps "+steps);
        return 2*steps;
    }
}
