package com.formulario.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class Controller {

    PdfService pdfService;
    SistemaService sistemaService;

    @PostMapping
    public ResponseEntity<byte[]> gerardoc(@RequestBody DtoDadosdoFormulario dtoDadosdoFormulario) {
      try{

          sistemaService.salvardados(dtoDadosdoFormulario);

        byte[] pdf = pdfService.gerarPDF(dtoDadosdoFormulario);

        // Configura os cabeçalhos para download/visualização
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "documento.pdf");


        return ResponseEntity.ok().headers(headers).body(pdf);
      }catch (Exception exception) {
          System.out.println("Erro ao salvar o candidato");
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
    }
}
