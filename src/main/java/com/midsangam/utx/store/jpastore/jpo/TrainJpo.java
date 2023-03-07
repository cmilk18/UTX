package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.Train;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Train")
public class TrainJpo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public TrainJpo(Train train){
        this.name = train.getName();
    }
    public Train toDomain(){
        Train train = new Train();
        train.setId(id);
        train.setName(name);

        return train;
    }
}
