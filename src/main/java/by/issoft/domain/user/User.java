package by.issoft.domain.user;

import by.issoft.domain.AbstractEntity;
import by.issoft.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(exclude = {"orders"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@SuperBuilder(toBuilder = true)
public class User extends AbstractEntity {
    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;

    @Column(name = "user_name", unique = true, nullable = false, length = 60)
    private String userName;

    @Column(name = "email", unique = true, nullable = false, length = 60)
    private String email;

    @Column(name = "phone", nullable = false, length = 21)
    private String phone;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "city", length = 20)
    private String city;

    @Column(name = "registration_date_time", nullable = false)
    @CreationTimestamp
    private LocalDateTime registrationDateTime;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private UserCategory userCategory;

    @Enumerated
    @Column(nullable = false, columnDefinition = "int not null default 1")
    private Role role = Role.USER;

    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Order> orders = new ArrayList<>();
}
