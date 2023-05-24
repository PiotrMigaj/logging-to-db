package pl.migibud.loggingtodb.employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/employee")
class EmployeeController {

    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @GetMapping
    EmployeeDto getEmployee(){
        logger.info("Got GET request...");
        return new EmployeeDto("Piotr","Migaj","pmigaj@gmail.com");
    }

    @PostMapping
    EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto){
        logger.info("Got POST request with body: {}",employeeDto);
        return employeeDto;
    }
}
