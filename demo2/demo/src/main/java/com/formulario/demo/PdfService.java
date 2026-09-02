package com.formulario.demo;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class PdfService {

    public byte[] gerarPDF(DtoDadosdoFormulario dtoDadosdoFormulario ) {
        try (ByteArrayOutputStream pdf = new ByteArrayOutputStream()) {
            // Inicializa os componentes do iText
            PdfWriter writer = new PdfWriter(pdf);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document documento = new Document(pdfDoc);

            documento.add(new Paragraph("Documento de solicitação").setBold().setFontSize(18));
            documento.add(new Paragraph("Dados do Candidato").setTextAlignment(TextAlignment.CENTER));
            documento.add(new Paragraph("Nome: " + dtoDadosdoFormulario.nome()));
            String dadosnascimento = "Nascimento: " + dtoDadosdoFormulario.dataNascimento().getDayOfMonth() + "/" + dtoDadosdoFormulario.dataNascimento().getMonthValue() + "/" + dtoDadosdoFormulario.dataNascimento().getYear();
            String dadosrg = "RG: " + dtoDadosdoFormulario.rg();
            String dadoscpf = "CPF: " + dtoDadosdoFormulario.cpf();
            documento.add(new Paragraph(dadosnascimento + "   " + dadosrg + "   " + dadoscpf));
            documento.add(new Paragraph("Telefone: " + dtoDadosdoFormulario.telefone()));
            documento.add(new Paragraph("E-mail: " + dtoDadosdoFormulario.email()));
            documento.add(new Paragraph("Endereço: " + dtoDadosdoFormulario.endereco() + " Nº: " + dtoDadosdoFormulario.numero()));
            documento.add(new Paragraph("Bairro: " + dtoDadosdoFormulario.bairro() + " CEP: " + dtoDadosdoFormulario.cep()));
            documento.add(new Paragraph("Grau de Escolaridade" + dtoDadosdoFormulario.grauEscolaridade() + " Escola: " + dtoDadosdoFormulario.escola()));


            documento.close();


            return pdf.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();

            throw new RuntimeException("Erro ao gerar o PDF: " + e.getMessage(), e);

        }


    }
}
