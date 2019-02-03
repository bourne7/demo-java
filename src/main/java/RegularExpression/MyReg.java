package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReg {

//  https://www.cnblogs.com/lzq198754/p/5780340.html
//  规则	                正则表达式语法
//  一个或多个汉字       ^[\u0391-\uFFE5]+$
//  邮政编码            ^[1-9]\d{5}$
//  QQ号码              	^[1-9]\d{4,10}$
//  邮箱                ^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\.){1,3}[a-zA-z\-]{1,}$
//  用户名（字母开头 + 数字/字母/下划线）	^[A-Za-z][A-Za-z1-9_-]+$
//  手机号码	            ^1[3|4|5|8][0-9]\d{8}$
//  URL	                ^((http|https)://)?([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$
//  18位身份证号	        ^(\d{6})(18|19|20)?(\d{2})([01]\d)([0123]\d)(\d{3})(\d|X|x)?$


    public static void main(String[] args) {
        // 要验证的字符串
        String str = "http://localhost:8080/test/get/page/fruit";
        // 正则表达式规则
        String regEx = ".*/page/.*";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 查找字符串中是否有匹配正则表达式的字符/字符串
        boolean rs = matcher.find();
        System.out.println(rs);
    }
}
