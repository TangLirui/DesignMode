package com.gupaoedu.pattern.delegate.mvc;


import com.gupaoedu.pattern.delegate.mvc.controllers.MemberController;
import com.gupaoedu.pattern.delegate.mvc.controllers.OrderController;
import com.gupaoedu.pattern.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //调度
        doDispatcher(req, resp);
    }

    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");

        if("getMemberById".equals(uri)) {
            new MemberController().getMemberById(mid);
        }else if("getOrderById".equals(uri)) {
            new OrderController().getOrderById(mid);
        }else if("logout".equals(uri)){
            new SystemController().logout();
        }else {
            resp.getWriter().write("404 not Found");
        }
    }
}
