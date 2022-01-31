package com.example.JpaPro.Controller;

import com.example.JpaPro.Entity.AccessLog;
import com.example.JpaPro.Entity.ErrorLog;
import com.example.JpaPro.Repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccessLogController {
    @Autowired
    private AccessRepository AccessRepo;
    @RequestMapping("/UpdateAccess")
    public String UpdateAccess(){
        AccessLog Acc = new AccessLog("acclvl1","acclvl2","acclvl3","03:11:00");
        AccessRepo.save(Acc);
        AccessLog Acc1 = new AccessLog("acclevl1","accflvl2","acclwvl3","05:41:00");
        AccessRepo.save(Acc1);
        AccessLog Acc2 = new AccessLog("acclfvl1","acgclvl2","accelvl3","06:21:00");
        AccessRepo.save(Acc2);
        AccessLog Acc3 = new AccessLog("acclgvl1","acbclvl2","accqlvl3","02:51:00");
        AccessRepo.save(Acc3);
        AccessLog Acc4 = new AccessLog("scure","wrong","pass","01:51:00");
        AccessRepo.save(Acc4);
        return "Accesshtml.html";
    }

}
