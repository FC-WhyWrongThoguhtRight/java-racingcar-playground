package StringPlus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlusCalculator {

    public static final String DEFAULT_REGEX = ",|:";
    public static final String REGEX = "//(.)\n(.*)";
    public static final Pattern NUMBER_REGEX = Pattern.compile("\\d+");

    public static int splitAndSum(String s1) {
        if (isMatch(s1)) {
            return 0;
        }
        return getParse(s1);
    }

    /*
    구분자로 문자 구분
     */
    private static int getParse(String s1) {
        String[] tokens = s1.split(DEFAULT_REGEX);

        Matcher m = Pattern.compile(REGEX).matcher(s1);
        if (m.find()) {
            String customDelimiter = m.group(1);
            tokens = m.group(2).split(customDelimiter);
        }

        // 덧셈 구현
        return getSum(tokens);
    }

    /*
    빈값 체크
     */
    private static boolean isMatch(String s1) {
        return s1 == null || s1.isEmpty();
    }

    /*
    덧셈을 구현
     */
    private static int getSum(String[] tokens) {
        int sum = 0;
        for (String s : tokens) {
            validateString(s);
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    /*
    음수 또는 숫자 아닌 문자 체크
     */
    private static void validateString(String s) {
        if (s.contains("-") || !NUMBER_REGEX.matcher(s).find()) {
            throw new RuntimeException("0 또는 양의 정수만 계산 가능합니다.");
        }
    }

}
