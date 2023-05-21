package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps

@Generated
public
    fun databaseInstanceReadReplicaProps(initializer: DatabaseInstanceReadReplicaProps.Builder.() -> Unit
    = {}): DatabaseInstanceReadReplicaProps =
    DatabaseInstanceReadReplicaProps.builder().apply(initializer).build()
