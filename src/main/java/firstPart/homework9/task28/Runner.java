package firstPart.homework9.task28;

public class Runner {
    public static void main(String[] args) {
        Array<Long> arrayLong = new Array<>(new Long[]{111L, 1524239999L, 14235324L});
        Array<Float> arrayFloat = new Array<>(new Float[]{17.312f, 1239.789f});

        System.out.println("arrayLong[1] = " + arrayLong.get(1) + "\narrayFloat[0] = " + arrayFloat.get(0));
    }
}
