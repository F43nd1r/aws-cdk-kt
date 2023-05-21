package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceSourceProps

@Generated
public fun databaseInstanceSourceProps(initializer: DatabaseInstanceSourceProps.Builder.() -> Unit =
    {}): DatabaseInstanceSourceProps =
    DatabaseInstanceSourceProps.builder().apply(initializer).build()
