package com.test;

import com.test.Banks;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-13T21:03:16")
@StaticMetamodel(Branches.class)
public class Branches_ { 

    public static volatile SingularAttribute<Branches, Banks> bankId;
    public static volatile SingularAttribute<Branches, String> address;
    public static volatile SingularAttribute<Branches, String> city;
    public static volatile SingularAttribute<Branches, String> district;
    public static volatile SingularAttribute<Branches, String> state;
    public static volatile SingularAttribute<Branches, String> ifsc;
    public static volatile SingularAttribute<Branches, String> branch;

}