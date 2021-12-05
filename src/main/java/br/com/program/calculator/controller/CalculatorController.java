package br.com.program.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.program.calculator.service.CalculatorService;
import lombok.AllArgsConstructor;

/**
 * @version 1.0
 * @author Lucas Novais dos Santos
 */
@CrossOrigin(origins = "http://localhost:8080/CalculatorApplication")
@RestController
@AllArgsConstructor
@RequestMapping("/**")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping(path = "/Do")
    public ResponseEntity<?> calculation(@RequestBody String visor) {
        return ResponseEntity.ok(calculatorService.convertCharacters(visor));
    }

}
