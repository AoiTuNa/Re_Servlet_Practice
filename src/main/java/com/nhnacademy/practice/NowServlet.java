package com.nhnacademy.practice;

import com.nhnacademy.practice.util.CounterUtils;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@WebServlet(name = "nowservlet", value = "/now-servlet")
public class NowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CounterUtils.increaseCounter(getServletContext());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String localStringTime = localDateTime.format(dateTimeFormatter);
        try(PrintWriter writer = new PrintWriter(resp.getWriter())) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='utf-8'>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>현재 시간</h1>");
            writer.println("<h1>"+localStringTime+"</h1>");
            writer.println("<h1> counter : " + getServletContext().getAttribute("counter") + "<h1>");
            writer.println("</body>");
            writer.println("</html>");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
