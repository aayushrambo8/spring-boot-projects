package live.aayush.FilterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        System.out.println("Incoming Request : " + httpServletRequest.getMethod() + " " + httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Response status: " + httpServletResponse.getStatus());
    }
}
