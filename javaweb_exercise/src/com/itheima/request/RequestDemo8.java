package com.itheima.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("requestDemo8被访问了。。。。");
        //获取request对象的请求转发器对象RequestDispatcher
        //下面一行代码错误；请求转发的路径不能再次添加项目的虚拟目录，
        // 因为请求转发是发生在同一个项目内的，因此项目虚拟目录就可省略
       // RequestDispatcher requestDispatcher = request.getRequestDispatcher("/day14/requestDemo9");
        //转发之前，向request域中存储一些数据
        request.setAttribute("msg", "hello, 我是requestDemo8。。。");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");
        //调用转发的方法forward()
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
