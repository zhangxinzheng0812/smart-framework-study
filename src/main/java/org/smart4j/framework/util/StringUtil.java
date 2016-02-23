package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by yzy on 2016/2/23.
 */
public final  class StringUtil {
    public static boolean isEmpty(String str){
        if(null != str){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    public static String[] spiltString(String str, String separator){
        return StringUtils.splitByWholeSeparator(str,separator);
    }
}
