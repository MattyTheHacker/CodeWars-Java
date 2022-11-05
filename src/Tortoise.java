public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int[] result = new int[3];
        int time = g * 3600 / (v2 - v1);
        result[0] = time / 3600;
        result[1] = time % 3600 / 60;
        result[2] = time % 60;
        return result;
    }
}