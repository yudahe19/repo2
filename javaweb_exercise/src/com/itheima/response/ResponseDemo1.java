package com.itheima.response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response的流对象的默认编码为ISO-8859-1，而浏览器端的默认编码为GBK，
        // 这样由于编码和解码不一致，就会产生中文乱码
        //解决中文乱码方法：在获取response流对象之前，设置编码为GBK，同浏览器编码一致
       // response.setCharacterEncoding("gbk");

        //告诉浏览器，服务器本次发送响应体的数据格式以及编码格式，之后服务器便会自动的按照该编码格式进行解码
       // response.setHeader("content-type", "text/html;charset=utf-8");
        response.setContentType("text/html;charset=gbk");

        //获取response对象的字符输出流对象
        PrintWriter pw = response.getWriter();
        //输出数据
        pw.write("你好, response");

        //获取字节输出流对象
       /* ServletOutputStream sos = response.getOutputStream();
        sos.write("你好".getBytes("utf-8"));*/
    }
}
