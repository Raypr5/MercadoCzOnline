package br.edu.catolica.ppi.ProjetoMC.controller;

import br.edu.catolica.ppi.ProjetoMC.service.SegmentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segmento")
public class SegmentoController {

    /*
    private final SegmentoService segmentoService;


    public SegmentoController(SegmentoService segmentoService) {
        this.segmentoService = segmentoService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Segmento segmento){
        return ResponseEntity.ok()
                .body(segmentoService.saveOrUpdate(segmento));
    }
     */
}
