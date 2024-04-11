package miu.edu.citylibraryapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Data
@NoArgsConstructor
public class ATM {
    @Id
    private Long id;
    @ManyToOne
    private Bank bank;
    @OneToOne
    private Provider provider;
    @ManyToMany
    private List<User> users;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
