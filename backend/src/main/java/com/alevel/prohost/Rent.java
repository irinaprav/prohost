package com.alevel.prohost;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Rent")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_User")
    private User idUser;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Location")
    private Location idLocation;

    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "rating")
    private Long rating;

    @Column(name = "evictionDay")
    @Temporal(TemporalType.DATE)
    private Date evictionDay;

    @Column(name="comment")
    private String comment;

    public Rent() {
    }


}
