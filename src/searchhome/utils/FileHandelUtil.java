package searchhome.utils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类型区分工具类
 */
public class FileHandelUtil {
    public static boolean isAvisave(String sufix){
        return Arrays.asList(new String[]{"pdf","txt","epub","azw3","mobi","torrent","zip","wav"}).contains(sufix);
    }
    public static boolean isBook(String sufix){
        return Arrays.asList(new String[]{"pdf","epub","azw3","mobi"}).contains(sufix);
    }


    public static boolean judgeContainsStr(String cardNum) {
        String regex=".*[a-zA-Z]+.*";
        Matcher m= Pattern.compile(regex).matcher(cardNum);
        return m.matches();
    }
}
