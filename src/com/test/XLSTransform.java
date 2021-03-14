package com.test;

public class XLSTransform implements Transform{
    private String ToType = "XLS文件";
    @Override
    public void To(Source s) {
        System.out.println("源文件类型--转化类型\n"+s.From()+"   "+ToType);
    }
}
