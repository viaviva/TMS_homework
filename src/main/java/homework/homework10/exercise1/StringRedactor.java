package homework.homework10.exercise1;
import org.apache.commons.lang3.StringUtils;

public class StringRedactor {
    public static boolean inputCheck(String string) {
        if (string.length() == 22) {
            String[] split_string = string.split("-");
            String[] forth_split = split_string[4].split("");

            return StringUtils.isNumeric(split_string[0]) && StringUtils.isNumeric(split_string[2])
                    && StringUtils.isAlpha(split_string[1]) && StringUtils.isAlpha(split_string[3])
                    && StringUtils.isNumeric(forth_split[0]) && StringUtils.isNumeric(forth_split[2])
                    && StringUtils.isAlpha(forth_split[1]) && StringUtils.isAlpha(forth_split[3]);
        }
        else
        {
            return false;
        }
    }

    public static void printString(String input_string)
    {
        String[] split_string = input_string.split("-");
        String[] forth_split = split_string[4].split("");

        printFirstTwoNumericBlocks(split_string);
        replaceTwoAlphaBlocks(input_string);
        printAllLettersInLowerCase(split_string, forth_split);
        printAllLettersInUpperCase(split_string, forth_split);
        printEquals(input_string);
        printStringStartsWith(input_string);
        printStringEndsWith(input_string);
    }

    public static void printFirstTwoNumericBlocks(String[] split_string)
    {
        System.out.println("1) вывод на экран в строку два первых блока по 4 цифры: ");
        System.out.println(split_string[0] + split_string[2]);
    }

    public static void replaceTwoAlphaBlocks(String input_string)
    {
        StringBuilder sb = new StringBuilder(input_string);
        System.out.println("2) вывод на экран номер документа, но блоки из трёч букв заменить на ***: ");
        System.out.println(sb.replace(5, 8, "***").replace(14, 17, "***"));
    }

    public static void printAllLettersInLowerCase(String[] split_string, String[] forth_split)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("3) " + sb.append(split_string[1].toLowerCase()).append("/").append(split_string[3].toLowerCase())
                .append("/").append(forth_split[1].toLowerCase()).append("/").append(forth_split[3].toLowerCase()));
    }

    public static void printAllLettersInUpperCase(String[] split_string, String[] forth_split)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("4) Letters: " + sb.append(split_string[1].toUpperCase()).append("/").append(split_string[3].toUpperCase())
                .append("/").append(forth_split[1].toUpperCase()).append("/").append(forth_split[3].toUpperCase()));
    }

    public static void printEquals(String input_string)
    {
        String str = "abc";
        boolean checkEquals = input_string.regionMatches(true, 5, str, 0, 3);
        if (!checkEquals)
        {
            checkEquals = input_string.regionMatches(true, 14, str, 0, 3);
        }

        System.out.println("5) содержит ли строка последовательноть abc: " + checkEquals);
    }

    public static void printStringStartsWith(String input_string)
    {
        System.out.println("6) Начинается ли строка с подстроки 555: " + input_string.startsWith("555"));
    }

    public static void printStringEndsWith(String input_string)
    {
        System.out.println("7) Заканчивается ли строка на 1a2b: " + input_string.endsWith("1a2b"));

    }
}
