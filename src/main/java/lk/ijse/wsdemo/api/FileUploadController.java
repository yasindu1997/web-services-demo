package lk.ijse.wsdemo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

    @GetMapping("/api/upload")
    @ResponseBody
    public String uploadedData() {
        return "DONE";
    }

    @PostMapping("/api/upload")
    @ResponseBody
    public String uploadData(@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        return "DONE";
    }
}
