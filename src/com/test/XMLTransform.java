package com.test;

public class XMLTransform implements Transform{
    private String ToType = "XML文件";
    @Override
    public void To(Source s) {
        System.out.println("源文件类型--转化类型\n"+s.From()+"   "+ToType);
    }
}
