package gr.codehub.sb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Customer {
    private Long id; // wrapper
    private String name;
    private String email;
    private Date registrationDate;

}
