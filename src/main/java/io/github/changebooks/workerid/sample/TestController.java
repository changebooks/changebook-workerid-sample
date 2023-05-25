package io.github.changebooks.workerid.sample;

import io.github.changebooks.workerid.WorkerId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author changebooks@qq.com
 */
@RequestMapping("test")
@RestController
public class TestController {

    @Resource
    private WorkerId workerId;

    @GetMapping(value = "/test")
    public int test() {
        return workerId.holdId();
    }

}
