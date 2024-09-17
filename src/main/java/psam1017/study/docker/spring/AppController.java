package psam1017.study.docker.spring;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @GetMapping("")
    public Map<String, String> getInfo(HttpServletRequest request) {
        Map<String, String> response = new HashMap<>();

        if (request.getHeader("X-Real-IP") != null) {
            response.put("X-Real-IP", request.getHeader("X-Real-IP"));
        }
        if (request.getHeader("X-Forwarded-For") != null) {
            response.put("X-Forwarded-For", request.getHeader("X-Forwarded-For"));
        }
        if (request.getHeader("Host") != null) {
            response.put("Host", request.getHeader("Host"));
        }

        return response;
    }
}
