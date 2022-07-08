package searchhome.utils;

import java.util.Arrays;

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
}
