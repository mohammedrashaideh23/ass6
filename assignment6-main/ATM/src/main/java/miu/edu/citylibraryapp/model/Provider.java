package miu.edu.citylibraryapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@Data
@NoArgsConstructor
public class Provider {
    @Id
    private Long id;
    @OneToOne (mappedBy = "provider")
    private ATM atm;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
