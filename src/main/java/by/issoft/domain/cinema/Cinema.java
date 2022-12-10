package by.issoft.domain.cinema;

import by.issoft.domain.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(exclude = {"movieRooms"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cinema")
@SuperBuilder(toBuilder = true)
public class Cinema extends AbstractEntity {
    @Column(name = "name", unique = true, nullable = false, length = 50)
    private String name;

    @Column(name = "address", nullable = false, length = 300)
    private String address;

    @Column(name = "city", nullable = false, length = 30)
    private String city;

    @Column(name = "email", unique = true, nullable = false, length = 60)
    private String email;

    @Column(name = "phone", nullable = false, length = 21)
    private String phone;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "cinema_id")
    @JsonIgnore
    @Builder.Default
    private List<MovieRoom> movieRooms = new ArrayList<>();
}
