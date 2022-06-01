package text_6_1;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class arraylistculd {
    public static void main(String[] args) {
        //创建ArrayList的集合
        ArrayList<HashMap<String,String>> arr=new ArrayList<HashMap<String, String>>();

//创建HaedMap集合，并添加建元素
        HashMap<String,String> hash1=new HashMap<String, String>();

        hash1.put("xiaoge","haohuai");
        hash1.put("xiaomei","haomei");

        HashMap<String,String> hash2=new HashMap<String, String>();
        hash2.put("xiaoge","haohuai");
        hash2.put("xiaomei","haomei");

        HashMap<String,String> hash3=new HashMap<String, String>();
        hash3.put("xiaoge","haohuai");
        hash3.put("xiaomei","haomei");


        arr.add(hash1);
        arr.add(hash2);
        arr.add(hash3);

        for(HashMap<String,String> hm:arr){
            Set<String> keySet=hm.keySet();
            for(String s:keySet){
                String p = hm.get(s);
                System.out.println(s+","+p);
            }
        }
    }
}
