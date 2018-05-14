package com.test;

import com.test.Branches;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-13T21:03:16")
@StaticMetamodel(Banks.class)
public class Banks_ { 

    public static volatile SingularAttribute<Banks, String> name;
    public static volatile SingularAttribute<Banks, Long> id;
    public static volatile CollectionAttribute<Banks, Branches> branchesCollection;

}