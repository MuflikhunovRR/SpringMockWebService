package ru.gotoqa.sp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.gotoqa.sp.models.PhonesByCardNumberRq;
import ru.gotoqa.sp.models.PhonesByCardNumberRs;
import ru.gotoqa.sp.models.StatusRule;


/**
 * @author Muflikhunov Roman
 */

@RestController
public class PhonesByCardNumberController {

    @RequestMapping(value = "/checkCard", method = RequestMethod.POST)
    public ResponseEntity<PhonesByCardNumberRs> checkCard(@RequestBody PhonesByCardNumberRq phonesByCardNumberRq){
        PhonesByCardNumberRs phonesByCardNumberRs = new PhonesByCardNumberRs();
        phonesByCardNumberRs.setValue(phonesByCardNumberRq.getMessages().getCardNumbers());
        StatusRule statusRule = new StatusRule();
        statusRule.setCode("FAIL");
        statusRule.setDesc("Сообщение не обработано");
        phonesByCardNumberRs.setStatusRuleObject(statusRule);
        phonesByCardNumberRs.setTimeout(10L);

        if (phonesByCardNumberRq.getMessages().getCardNumbers().matches("^4.*")) {
            statusRule.setCode("SUCCESS");
            statusRule.setDesc("Успешно обработано");
        }
        return new ResponseEntity<>(phonesByCardNumberRs, HttpStatus.OK);
    }

    @RequestMapping(value = "/")
    public ResponseEntity<PhonesByCardNumberRs> get(){
        PhonesByCardNumberRs phonesByCardNumberRs = new PhonesByCardNumberRs();
        phonesByCardNumberRs.setValue("4444000022221111");
        StatusRule statusRule = new StatusRule();
        statusRule.setCode("SUCCESS");
        statusRule.setDesc("Успешно обработано");
        phonesByCardNumberRs.setStatusRuleObject(statusRule);
        phonesByCardNumberRs.setTimeout(10L);
        return new ResponseEntity<>(phonesByCardNumberRs, HttpStatus.OK);
    }

}
