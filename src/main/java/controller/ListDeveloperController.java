package controller;

import model.Developer;
import service.DeveloperService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class ListDeveloperController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DeveloperService developerService = new DeveloperService();
        List<Developer> list = developerService.getAll();
        req.getSession().setAttribute("temp", list);

        req.getRequestDispatcher("mypage.jsp").forward(req, resp);

    }

}