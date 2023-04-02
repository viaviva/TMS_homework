package homework.homework11.exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите строку: ");
        StringBuilder inputString = new StringBuilder(scanner.next());

        Map<Character, Integer> hooks = new HashMap<>();
        hooks.put('[', 1);
        hooks.put('{', 2);
        hooks.put('<', 3);
        hooks.put('(', 4);
        hooks.put(']', 5);
        hooks.put('}', 6);
        hooks.put('>', 7);
        hooks.put(')', 8);

        for (int i = 0; i < inputString.length(); i++)
        {
            if (!hooks.containsKey(inputString.charAt(i)))
            {
                inputString.deleteCharAt(i);
                i--;
            }
        }

        char[] charsInString = new char[inputString.length()];
        inputString.getChars(0, inputString.length(), charsInString, 0);

        Deque<Integer> openHookDeque = new ArrayDeque<>();
        Deque<Integer> closeHookDeque = new ArrayDeque<>();

        for (Character character : charsInString)
        {
            int newHook = hooks.get(character);
            if (newHook >= 5)
            {
                int openHookByCloseHook = switch (newHook)
                {
                    case 5 -> 1;
                    case 6 -> 2;
                    case 7 -> 3;
                    case 8 -> 4;
                    default -> 0;
                };
                if (openHookByCloseHook == openHookDeque.peekLast())
                {
                    openHookDeque.pollLast();
                }
                else
                {
                    closeHookDeque.addLast(openHookByCloseHook);
                }
            }
            else
            {
                openHookDeque.addLast(newHook);
            }
        }

        if (!openHookDeque.isEmpty() && !closeHookDeque.isEmpty())
        {
            System.out.println("строка неправильна!");
        }
        else
        {
            System.out.println("строка в норме!");
        }
    }
}
