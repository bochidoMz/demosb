package ec.edu.insteclrg.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

import ec.edu.insteclrg.enums.Tipocomunicado;

@Getter
@Setter
@Entity
public class Comunicado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, length = 60)
    private String contenido;

    @Column()
    private Date fecha;
    
    @Column()
    private Tipocomunicado tipocomunicado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( nullable = false)
    private Barrio barrio;

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( nullable = false)
    private Presidente presidente;*/
    


}

   





