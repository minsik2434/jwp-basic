package next.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import core.db.DataBase;
import next.model.User;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet(value={"/users/update","/user/updateForm"})
public class UpdateUserFormServlet extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(UpdateUserFormServlet.class);
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/user/updateForm.jsp");
        rd.forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        log.debug(req.getParameter("userId"));
        //User user = DataBase.findUserById(req.getParameter("userId"));
        // User updateUser = new User(
        //     req.getParameter("userId"), 
        //     req.getParameter("password"), 
        //     req.getParameter("name"),
        //     req.getParameter("email")
        // );
        // //log.debug("update user {}",updateUser);
        resp.sendRedirect("/");
    }

}
