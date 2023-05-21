package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceAttributes

@Generated
public fun databaseInstanceAttributes(initializer: DatabaseInstanceAttributes.Builder.() -> Unit =
    {}): DatabaseInstanceAttributes =
    DatabaseInstanceAttributes.builder().apply(initializer).build()
