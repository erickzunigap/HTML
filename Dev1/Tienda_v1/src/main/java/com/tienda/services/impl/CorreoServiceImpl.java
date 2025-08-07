package com.tienda.services.impl;

import jakarta.mail.MessagingException;
import com.tienda.services.CorreoService; 
import jakarta.mail.MessagingException; 
import jakarta.mail.internet.MimeMessage; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.mail.javamail.JavaMailSender; 
import org.springframework.mail.javamail.MimeMessageHelper; 
import org.springframework.stereotype.Service;

@Service
public interface CorreoServiceImpl {
    
    @Autowired
    private javaMailSender mailSender;
    
    @Override
    public void enviarCorreoHTML(
            String para, //A quien se le va a enviar el correo
            String asunto, //Titulo principal
            String contenidoHTML)  //Cuerpo del correo
            throws MessagingException; //No puede enviar el correo
    
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper 
                = new MimeMessageHelper(message, 
                        true);
        helper.setTo(para); //estoy adjuntando a la persona a quien le voy a enviar el correo
        helper.setSubject(asunto); //
        helper.setText(contenidoHtml,true); //setteamos el valor o el textos que le vamos a enviar al usuario
        mailSender.send(message); //enviar el correo
    
    
    )
    
}
