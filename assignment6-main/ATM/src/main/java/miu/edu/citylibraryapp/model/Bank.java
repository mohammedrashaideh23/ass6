package miu.edu.citylibraryapp.model;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Data
@NoArgsConstructor
public class Bank {
    @Id
    private Long id;
    private String name;
    @OneToMany
    private List<User> user;
    @OneToMany
    private List<ATM> atm;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
