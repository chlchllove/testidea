package com.cc.comtrol;

import java.io.IOException;
import java.io.PrintWriter;

public class PageServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("接受到客户端的请求，返回响应的登录页面");
        //设置响应编码
        response.setContentType("text/html");
        //获取响应的输出流对象
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<form action='login' method='get'>");
        out.write("name:<input type='text' name='name' value='' ><br/>");
        out.write("pwd:<input type='text' name='pwd' value=''><br/>");
        out.write("<input type='submit' value='login'>");
        out.write("</form>");
        out.write("</body>");
        out.write("</html>");
    }
}
