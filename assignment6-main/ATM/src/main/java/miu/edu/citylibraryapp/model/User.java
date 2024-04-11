package miu.edu.citylibraryapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Data
@NoArgsConstructor
public class User {
    @Id
    private Long id;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<ATM> atms;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
