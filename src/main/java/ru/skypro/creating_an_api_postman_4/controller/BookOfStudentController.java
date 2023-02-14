package ru.skypro.creating_an_api_postman_4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class BookOfStudentController {
    @GetMapping
    String greeting() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    String showInfo() {
        return "Автор: Полина <br> " +
                "Имя проекта: Сказки <br>" +
                "Дата создания проекта: 31.01.2023 <br>" +
                "Этот проект позволяет малышам понять в мир";
    }

}