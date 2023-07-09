package com.sutaruhin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstSpringBootController {

    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        return calculateDayOfWeek(date);
    }

    @GetMapping("/plus/{num1}/{num2}")
    public int calcPlus(@PathVariable String num1, @PathVariable String num2) {
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        return intNum1 + intNum2;
    }

    @GetMapping("/minus/{num1}/{num2}")
    public int calcMinus(@PathVariable String num1, @PathVariable String num2) {
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        return intNum1 - intNum2;
    }

    @GetMapping("/times/{num1}/{num2}")
    public int calcTimes(@PathVariable String num1, @PathVariable String num2) {
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        return intNum1 * intNum2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public int calcDivide(@PathVariable String num1, @PathVariable String num2) {
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        return intNum1 / intNum2;
    }

    private String calculateDayOfWeek(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.getDayOfWeek().name();
    }
}