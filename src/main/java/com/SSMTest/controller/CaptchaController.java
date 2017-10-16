package com.SSMTest.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/code")
public class CaptchaController {

    @Autowired
    private Producer captchaProducer = null;

    @RequestMapping(value = "captcha-image")
    public ModelAndView getKaptchaImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String code = (String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.out.println("验证码: " + code );

        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");

        String capText = captchaProducer.createText();
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);

        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
        return null;
    }



    @RequestMapping(value = "checkCaptchaCode")
     public void checkCaptchaCode(HttpServletRequest request, HttpServletResponse response,@RequestParam("captchaCode") String captchaCode){
               System.out.println("页面输入验证码===="+captchaCode);

               response.setCharacterEncoding("UTF-8");
               response.setHeader("Pragma", "No-cache");
                response.setHeader("Cache-Control", "no-cache");
                 response.setDateHeader("Expires", 0);

                 String generateCode =(String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
                 String result = "";
                if(generateCode.equals(captchaCode)){
                         result = "验证成功";
                     }else{
                         result = "输入错误";
                     }
                 PrintWriter out = null;
                 try {
                         out = response.getWriter();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 out.print(result);
                 out.flush();
             }
}