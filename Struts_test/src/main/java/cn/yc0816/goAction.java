package cn.yc0816;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class goAction extends ActionSupport {
    public String execute(){
        return SUCCESS;
    }
    public String test1(){
        System.out.println("111111");
        return "1";
    }

    /**
     * ServletActionContext 使用该类的静态方法创建request对象
     * @return
     */
    public String test2(){
        System.out.println("22222执行了·····");
        HttpServletRequest request = ServletActionContext.getRequest();
        String uname = request.getParameter("uname");
        System.out.println(uname);
        return "2";
    }

    /**
     * ActionContext   使用该类的静态方法创建容器对象 获取参数集合
     * @return
     */
    public String test3(){
        System.out.println("333333执行了···");
        ActionContext context = ActionContext.getContext();
        Map<String, Object> map = context.getParameters();
        Set<String> set = map.keySet();
        for (String key : set) {
            Object[] objects = (Object[]) map.get(key);//这里我之所以要转化成object数组的形式，是因为表单提交数据也有可能是复选框的情况，这里要考虑周全
            System.out.println(Arrays.toString(objects));
        }

        return "3";
    }
    public String test4(){
        System.out.println("444444444");
        return "4";
    }
}
