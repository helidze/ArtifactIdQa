package GroupIdQa;

public class Pool {
    public static void main(String[] args) {
        Pool pool = new Pool();
        System.out.println("Объем басейна = " + pool.getPoolVolume(1,2,3) + " литров");

    }
    public long getPoolVolume(int depth, int width, int length ){
        long volume = depth * width * length;
        return volume;
    }
}
