package psam1017.study.docker.spring;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @GetMapping("/api/app")
    public Map<String, String> getInfo(HttpServletRequest request) {
        Map<String, String> response = new HashMap<>();

        if (request.getHeader("X-Real_IP") != null) {
            response.put("X-Real-IP", request.getHeader("X-Real_IP"));
        }
        if (request.getHeader("Host") != null) {
            response.put("Host", request.getHeader("Host"));
        }
        return response;
    }
}
