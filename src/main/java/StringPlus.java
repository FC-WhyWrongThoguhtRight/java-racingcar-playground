import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlus {

    String DELIMITER;

    public StringPlus() {
        this.DELIMITER = ",|:";
    }

    public int plus(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }

        String[] tokens = getTokens(s);

        return sumToken(tokens);
    }

    private int sumToken(String[] tokens) {
        int result = 0;
        for(int i = 0 ; i < tokens.length ; i++){
            result += parseInt(tokens[i]);
        }
        return result;
    }

    private int parseInt(String i) {
        if(i.contains("-")){
            throw new RuntimeException("minus number");
        }
        return Integer.parseInt(i);
    }

    private String[] getTokens(String s) {
        String[] tokens;
        if(containsCommaAndClone(s) || isLengthOne(s) ){
            tokens = s.split(DELIMITER);
        }else{
            tokens = getCustomDelimiter(s);
        }
        return tokens;
    }

    private boolean isLengthOne(String s) {
        return s.length() == 1;
    }

    private String[] getCustomDelimiter(String s) {

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        if(m.find()){
            String delimiter = m.group(1);
            return m.group(2).split(delimiter);
        }
        return null;
    }

    private static boolean containsCommaAndClone(String s) {
        return s.contains(",") || s.contains(":");
    }
}
