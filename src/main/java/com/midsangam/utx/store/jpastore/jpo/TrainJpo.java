package com.midsangam.utx.store.jpastore.jpo;

import com.midsangam.utx.model.Train;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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
