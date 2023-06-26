package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to the login page
        String userEmail = request.getParameter("email");
        String userName = request.getParameter("username");
        String userPassword = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        boolean inputHasErrors = userName.isEmpty()
                || userEmail.isEmpty()
                || userPassword.isEmpty()
                || (! userPassword.equals(passwordConfirmation));

        if (inputHasErrors) {
            response.sendRedirect("/register");
            return;
        }
        User user = new User(userName, userEmail, userPassword);
        DaoFactory.getUsersDao().insert(user);
        response.sendRedirect("/login");
    }
}
