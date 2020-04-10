package cn.yc0816;

import cn.yc0816.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class FormAction extends ActionSupport implements ModelDriven<User> {

/*   属性封装
 private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    public String execute(){

        /*HttpServletRequest request = ServletActionContext.getRequest();
        ServletContext servletContext = ServletActionContext.getServletContext();
        HttpSession session = ServletActionContext.getRequest().getSession();*/


        /* 原始封装
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        System.out.println(user);
        */

        /* 属性封装
        System.out.println(username+password);
        */

        System.out.println(user);
        return NONE;
    }

    private User user = new User();
    public User getModel() {
        return user;
    }
}
