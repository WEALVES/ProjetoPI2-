package br.com.techstore.servlet;

import br.com.techstore.dao.UserDao;
import br.com.techstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-user")
public class CreateAccountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse resp) throws ServletException, IOException {
        String userName = servletRequest.getParameter("user-name");
        String senha1 = servletRequest.getParameter("senha-1");
        String senha2 = servletRequest.getParameter("senha-2");
        String userNascimento = servletRequest.getParameter("user-nascimento");
        String userCpf = servletRequest.getParameter("user-cpf");
        String userEndereco = servletRequest.getParameter("user-endereco");
        String userEmail = servletRequest.getParameter("user-email");
        String userCep = servletRequest.getParameter("user-cep");

        if (senha1.equals(senha2) && senha1.length() >= 8) {
            User user = new User(userName, userNascimento, userCpf, userEmail, senha1, userEndereco, userCep);
            boolean retorno = new UserDao().createUser(user);
            if(retorno) {
                servletRequest.getRequestDispatcher("/index.jsp").forward(servletRequest, resp);
            }
            else {
                servletRequest.getRequestDispatcher("/cadastro/cadastro.jsp").forward(servletRequest, resp);
            }

        } else {
            servletRequest.getRequestDispatcher("/cadastro/cadastro.jsp").forward(servletRequest, resp);
        }
    }
}