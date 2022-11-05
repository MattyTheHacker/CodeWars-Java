import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals("NORTH") && list.get(i + 1).equals("SOUTH") ||
                    list.get(i).equals("SOUTH") && list.get(i + 1).equals("NORTH") ||
                    list.get(i).equals("EAST") && list.get(i + 1).equals("WEST") ||
                    list.get(i).equals("WEST") && list.get(i + 1).equals("EAST")) {
                list.remove(i);
                list.remove(i);
                i = -1;
            }
        }
        return list.toArray(new String[0]);
    }

    public static String[] Alternative(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.toArray(String[]::new);
    }
}