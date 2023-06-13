package com.atguigu01.string.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 14:26
 */
public class StringAnswers {
    //题目1：
    public String myTrim(String str) {
        if (str != null) {
            int start = 0;// 用于记录从前往后首次索引位置不是空格的位置的索引
            int end = str.length() - 1;// 用于记录从后往前首次索引位置不是空格的位置的索引

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }

            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {
                return "";
            }

            return str.substring(start, end + 1);
        }
        return null;
    }

    @Test
    public void testMyTrim() {
        String str = "   a   ";
        // str = " ";
        String newStr = myTrim(str);
        System.out.println("---" + newStr + "---");
    }

    //题目2：
    // 方式一：
    public String reverse1(String str, int start, int end) {// start:2,end:5
        if (str != null) {
            // 1.
            char[] charArray = str.toCharArray();
            // 2.
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            // 3.
            return new String(charArray);

        }
        return null;

    }

    // 方式二：
    public String reverse2(String str, int start, int end) {
        // 1.
        String newStr = str.substring(0, start);// ab
        // 2.
        for (int i = end; i >= start; i--) {
            newStr += str.charAt(i);
        } // abfedc
        // 3.
        newStr += str.substring(end + 1);
        return newStr;
    }

    // 方式三：推荐 （相较于方式二做的改进）
    public String reverse3(String str, int start, int end) {// ArrayList list = new ArrayList(80);
        // 1.
        StringBuilder s = new StringBuilder(str.length());
        // 2.
        s.append(str.substring(0, start));// ab
        // 3.
        for (int i = end; i >= start; i--) {
            s.append(str.charAt(i));
        }

        // 4.
        s.append(str.substring(end + 1));

        // 5.
        return s.toString();

    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String str1 = reverse3(str, 2, 5);
        System.out.println(str1);// abfedcg

    }

    //题目3：
    // 判断str2在str1中出现的次数
    public int getCount(String mainStr, String subStr) {
        if (mainStr.length() >= subStr.length()) {
            int count = 0;
            int index = 0;
            // while((index = mainStr.indexOf(subStr)) != -1){
            //      count++;
            //      mainStr = mainStr.substring(index + subStr.length());
            // }
            // 改进：
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                index += subStr.length();
                count++;
            }

            return count;
        } else {
            return 0;
        }
    }

    @Test
    public void testGetCount() {
        String str1 = "cdabkkcadkabkebfkabkskab";
        String str2 = "ab";
        int count = getCount(str1, str2);
        System.out.println(count);
    }

    //题目4
    // 如果只存在一个最大长度的相同子串
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() > str2.length()) ? str1 : str2;
            String minStr = (str1.length() > str2.length()) ? str2 : str1;

            int len = minStr.length();

            for (int i = 0; i < len; i++) {// 0 1 2 3 4 此层循环决定要去几个字符

                for (int x = 0, y = len - i; y <= len; x++, y++) {

                    if (maxStr.contains(minStr.substring(x, y))) {

                        return minStr.substring(x, y);
                    }

                }

            }
        }
        return null;
    }

    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
    public String[] getMaxSameSubString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }
    // 如果存在多个长度相同的最大相同子串：使用ArrayList (第12章集合章节中讲ArrayList)
//	public List<String> getMaxSameSubString1(String str1, String str2) {
//		if (str1 != null && str2 != null) {
//			List<String> list = new ArrayList<String>();
//			String maxString = (str1.length() > str2.length()) ? str1 : str2;
//			String minString = (str1.length() > str2.length()) ? str2 : str1;
//
//			int len = minString.length();
//			for (int i = 0; i < len; i++) {
//				for (int x = 0, y = len - i; y <= len; x++, y++) {
//					String subString = minString.substring(x, y);
//					if (maxString.contains(subString)) {
//						list.add(subString);
//					}
//				}
//				if (list.size() != 0) {
//					break;
//				}
//			}
//			return list;
//		}
//
//		return null;
//	}

    @Test
    public void testGetMaxSameSubString() {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnmiodef";
        String[] strs = getMaxSameSubString1(str1, str2);
        System.out.println(Arrays.toString(strs));
    }

    //题目5
    @Test
    public void testSort() {
        String str = "abcwerthelloyuiodef";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String newStr = new String(arr);
        System.out.println(newStr);
    }

}
