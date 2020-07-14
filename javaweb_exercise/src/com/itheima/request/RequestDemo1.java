package com.itheima.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式为：" + method);
        //2、获取虚拟目录：也就是项目的目录
        String contextPath = request.getContextPath();
        System.out.println("项目的虚拟目录为：" + contextPath);
        //3、获取资源路径：也就是servlet的目录
        String servletPath = request.getServletPath();
        System.out.println("项目的资源路径为：" + servletPath);
        //4、获取GET方式的请求参数
        String queryString = request.getQueryString();
        System.out.println("GET方式的请求参数为：" + queryString);
        //5、获取请求的URI
        String requestURI = request.getRequestURI();
        System.out.println("请求的URI为： " + requestURI);
        //6、获取请求的URL
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("请求的URL为：" + requestURL);
        //7、获取协议及版本号
        String protocol = request.getProtocol();
        System.out.println("协议及版本号为：" + protocol);
        //8、获取远程客户端的IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println("客户机的IP为：" + remoteAddr);
    }
}
