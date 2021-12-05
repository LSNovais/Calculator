package br.com.program.calculator.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private List<String> listValuesConvert;
    private List<String> listValues;
    private List<Integer> listOperadores;

    public int doCalculation(String value) {

        return 100;
    }

    public int convertCharacters(String value) {

        // for (int x = 0; x < value.length(); x++) {
        // listValuesConvert.add(String.valueOf(value.charAt(x)));
        // }

        return 100;
    }

    public boolean isNumber(String val) {
        return val.contains("0123456789");
    }

}
