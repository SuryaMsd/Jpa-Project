package com.example.JpaPro.Controller;

import com.example.JpaPro.Entity.AccessLog;
import com.example.JpaPro.Entity.ErrorLog;
import com.example.JpaPro.Repository.ErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ErrorLogController {
    @Autowired
    private ErrorRepository ErrorRepo;
    @RequestMapping("/UpdateError")
    public String UpdateError(){
        ErrorLog Err = new ErrorLog("Errorlvl1","Errorlvl2","Errorlvl3","03:25:00");
        ErrorRepo.save(Err);
        ErrorLog Err1 = new ErrorLog("Erorlvl1","Erorlvl2","Erorlvl3","04:45:00");
        ErrorRepo.save(Err1);
        ErrorLog Err2 = new ErrorLog("Errrlvl1","Errorvl2","Errorlvil3","02:15:00");
        ErrorRepo.save(Err2);
        ErrorLog Err3 = new ErrorLog("Errolvl1","Errrlvl2","Errorllvl3","06:05:00");
        ErrorRepo.save(Err3);
        ErrorLog Err4 = new ErrorLog("Errs","auth","fail","01:02:00");
        ErrorRepo.save(Err4);
        return "Errorhtml.html";
    }

}
