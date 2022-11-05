import java.util.ArrayList;
import java.util.List;

public class RectangleToSquares {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> squares = new ArrayList<>();
        while (lng != wdth) {
            squares.add(Math.min(lng, wdth));
            if (lng > wdth) lng -= wdth;
            else wdth -= lng;
        }
        squares.add(lng);
        return squares;
    }
}
