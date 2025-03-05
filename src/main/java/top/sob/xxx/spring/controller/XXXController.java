package top.sob.xxx.spring.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sob.xxx.spring.service.XXXService;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/xxx")
public class XXXController {
    XXXService service;
}
