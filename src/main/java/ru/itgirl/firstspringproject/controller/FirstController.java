package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String today(@RequestParam(value = "name") DayOfWeek name) {
        String translate = null;
        if (name == DayOfWeek.MONDAY) {
            translate = "понедельник";
        } else if (name == DayOfWeek.TUESDAY) {
            translate = "вторник";
        } else if (name == DayOfWeek.WEDNESDAY) {
            translate = "среда";
        }  else if (name == DayOfWeek.THURSDAY) {
            translate = "четверг";
        }  else if (name == DayOfWeek.FRIDAY) {
            translate = "пятница";
        }  else if (name == DayOfWeek.SATURDAY) {
            translate = "суббота";
        }  else if (name == DayOfWeek.SUNDAY) {
            translate = "воскресенье";
        }
        return String.format("Сегодня %s!", translate);
    }
}
