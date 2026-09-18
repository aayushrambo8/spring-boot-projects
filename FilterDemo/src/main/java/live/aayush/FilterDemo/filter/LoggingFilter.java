package live.aayush.FilterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
@Order( 2)
public class LoggingFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        long startTime = System.currentTimeMillis();

        String requestID = UUID.randomUUID().toString();
        httpServletResponse.setHeader("X-Request-ID", requestID);

        System.out.println("Incoming Request : " + httpServletRequest.getMethod() + " " + httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        long endTime = System.currentTimeMillis();
        System.out.println("Response status: " + httpServletResponse.getStatus());
        System.out.println("Request processing time: " + (endTime - startTime) + "ms");

    }
}
