package live.aayush.FilterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;

@Component
public class ResponseFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        ContentCachingResponseWrapper  responseWrapper = new ContentCachingResponseWrapper(httpResponse);

        filterChain.doFilter(servletRequest, responseWrapper);
        byte[] originalContentByte = responseWrapper.getContentAsByteArray();
        String originalContentString = new String(originalContentByte);
        String modifiedContentString = """
                {
                    "originalResponse" : %s,
                    "Database" : "Student"
                }
                """.formatted(originalContentString);
        responseWrapper.getWriter().write(modifiedContentString);
        responseWrapper.copyBodyToResponse();

    }
}
