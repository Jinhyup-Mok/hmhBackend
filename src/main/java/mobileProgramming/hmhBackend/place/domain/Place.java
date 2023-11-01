package mobileProgramming.hmhBackend.place.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mobileProgramming.hmhBackend.join.entity.Member;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Place {

    @Id
    private Long id;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "member", referencedColumnName = "id", nullable = false)
    private Member member;

    @Column
    private String name;

    @Column
    private String address;

}
