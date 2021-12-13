package study.servlet.web.frontcontroller.V5.adapter;

import study.servlet.web.frontcontroller.ModelView;
import study.servlet.web.frontcontroller.V5.MyHanderAdapter;
import study.servlet.web.frontcontroller.v3.ControllerV3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ControllerV3HandlerAdapter implements MyHanderAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof ControllerV3);   // handler 가 ContollerV3 인지 물어보는것
    }

    @Override
    public ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        ControllerV3 controller = (ControllerV3) handler;

        Map<String, String> paramMap = createParamMap(request);
        ModelView mv = controller.process(paramMap);

        return mv;
    }

    private Map<String, String> createParamMap(HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()
                .forEachRemaining((paramName -> paramMap.put(paramName, request.getParameter(paramName))));
        return paramMap;
    }
}
