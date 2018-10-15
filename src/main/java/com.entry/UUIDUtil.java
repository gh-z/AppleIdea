package com.entry;

import java.util.Date;
import java.util.UUID;

/**
 * @ClassName: com.entry
 * @author: WMZ
 * @since: 2018/10/15 9:21
 * @version: v1.0.0
 */
public class UUIDUtil {

    private static String[] chars = new String[]{"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};

    /**
     * uuid_36 获取-好分割，36位UUID
     *
     * @return UUID
     */
    public static final String uuid_36() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    /**
     * uuid_32 获取-好分割，32位UUID
     *
     * @return UUID
     */
    public static final String uuid_32() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    /**
     * uuid_8 获取-好分割，12位UUID
     * 本算法利用62个可打印字符，通过随机生成32位UUID，由于UUID都为十六进制，
     * 所以将UUID分成8组，每4个为一组，然后通过模62操作，结果作为索引取出字符，
     *
     * @return UUID
     */
    public static final String uuid_8() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            int cha = x % 0x3E;
            shortBuffer.append(cha);
            System.out.print(str+"===="+x+"====="+cha+"\n");
        }
        return shortBuffer.toString();
    }

    /**
     * uuid_seq 获取整数序列号
     *
     * @return 返回整数序列号
     */
    public static final String uuid_seq(String prefix) {
        return prefix + (new Date()).getTime();
    }

    /**
     * uuid_seq 获取整数序列号
     *
     * @return 返回整数序列号
     */
    public static final String uuid_seq() {
        return uuid_seq("");
    }
}
