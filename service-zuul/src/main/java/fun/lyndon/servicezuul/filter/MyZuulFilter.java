package fun.lyndon.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/* @Author lyn
 * @Description //TODO 过滤器
 * @Date 2019/12/26 14:32
**/
@Component
public class MyZuulFilter extends ZuulFilter {


  /*  pre：路由之前
    routing：路由之时
    post： 路由之后
    error：发送错误调用*/
    @Override
    public String filterType() {
        return "pre";
    }


    //过滤等级
    @Override
    public int filterOrder() {
        return 0;
    }

    //是否过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //过滤器执行代码
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        Object token = request.getParameter("password");
        if (token==null){
            //设置
            requestContext.setSendZuulResponse(false);
            try {
                requestContext.getResponse().getWriter().write("not found password!");

            } catch (IOException e) {

            }
            return null;
        }
        return null;
    }
}
