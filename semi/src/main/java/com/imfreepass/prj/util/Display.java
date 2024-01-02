package com.imfreepass.prj.util;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imfreepass.prj.domain.AttachDTO;



@WebServlet("/display")
public class Display extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AttachDTO dto = new AttachDTO();

        String path = req.getParameter("path");
        String origin = req.getParameter("origin");
        String uuid = req.getParameter("uuid");
        String image = req.getParameter("image");

        dto.setUuid(uuid);
        dto.setPath(path);
        dto.setOrigin(origin);

        OutputStream os = resp.getOutputStream();
        
        // 파일이 존재하는지 확인
        if (dto.toFile(true, 1).exists()) {
            byte[] bytes = Files.readAllBytes(dto.toFile(true, 1).toPath());
            resp.setContentType(Files.probeContentType(dto.toFile(true, 1).toPath()));
            
            os.write(bytes);
        } else {
            // 이미지가 존재하지 않는 경우
            System.out.println("");
            // 사용자에게 오류 메시지를 반환하거나 다른 처리를 수행할 수 있음
        }
    }
}

