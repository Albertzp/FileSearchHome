package searchhome.utils;

import java.util.Arrays;

public class FileHandelUtil {
    public static boolean isAvisave(String sufix){
        return Arrays.asList(new String[]{"pdf","txt","epub","azw3","mobi","torrent","zip","wav"}).contains(sufix);
    }
    public static boolean isBook(String sufix){
        return Arrays.asList(new String[]{"pdf","epub","azw3","mobi"}).contains(sufix);
    }
}
