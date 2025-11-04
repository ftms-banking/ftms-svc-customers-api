package ftms.svc.customers.api.controller;

import ftms.svc.customers.api.constants.FtmsTransactionsApiConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(FtmsTransactionsApiConstants.FTMS_TRANSACTIONS_API_V1)
public class FtmsTransactionsController {

    /**
     * Returns basic health information of the service.
     *
     * @return a map containing status, service name, and version
     */
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "service", "FTMS Transactions Service",
                "version", "v1"
        );
    }
}
