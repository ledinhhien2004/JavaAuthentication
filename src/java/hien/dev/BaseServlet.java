/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hien.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import hien.dev.data.dao.Database;
import hien.dev.data.dao.DatabaseDao;


/**
 *
 * @author Nguoiluon
 */
@WebServlet(name = "BaseServlet", urlPatterns = {"/BaseServlet"})
public class BaseServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        super.init();  // Gọi phương thức init của HttpServlet để khởi tạo servlet
        DatabaseDao.init(new Database());  // Khởi tạo database
    }
}
