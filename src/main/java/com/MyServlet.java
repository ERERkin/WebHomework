package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h1>Su Mo Tu We Th Fr Sa</h1>");
        int k = 0;
        for(int i = 0; i < 4; i++){
            out.print("<h1>");
            for(int j = 0; j < 7; j++){
                k++;
                out.print(((k < 10) ? "&nbsp;&nbsp;" + k : "" + k) + "&nbsp;&nbsp;");
            }
            out.print("</h1>");
        }
        /*resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        // получаем параметр id
        String id = req.getParameter("id");
        int a = 0;
        if(id != null){
            a = Integer.parseInt(id);
            a *= a;
        }
        try {
            writer.println("<h2>Id:" + a + "<br> ku</h2>");
        } finally {
            writer.close();
        }*/
    }
}
