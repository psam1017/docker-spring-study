package psam1017.study.docker.spring;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final RedisTemplate<String, Object> redisTemplate;

    public AppController(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("")
    public String hello() {
        redisTemplate.opsForValue().set("key", "Hello, Docker!");
        return "Hello, Docker!";
    }
}
