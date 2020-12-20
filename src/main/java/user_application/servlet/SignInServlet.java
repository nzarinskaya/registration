package user_application.servlet;

import user_application.model.User;
import user_application.repository.AllUsersRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/signIn.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String id = req.getParameter("id");

        List<User> allUsers = AllUsersRepository.allUR.getAll();
        Optional<User> user = allUsers.stream().filter(u ->
                u.getLogin().equals(login) && u.getPassword().equals(password)).findAny();

        if (user.isPresent()) {
            req.getSession().setAttribute("login", user.get().getLogin());
            req.getSession().setAttribute("password", user.get().getPassword());
            req.getSession().setAttribute("id", user.get().getId());

            req.getSession().setAttribute("authorized", "true");
            resp.sendRedirect("/registration_/account");
        }else {
            req.setAttribute("signIn_error","Login or password is incorrect!");
            req.getRequestDispatcher("/jsp/signIn.jsp").forward(req, resp);
        }
    }
}
