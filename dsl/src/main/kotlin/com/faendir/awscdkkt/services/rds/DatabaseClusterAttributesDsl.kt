package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseClusterAttributes

@Generated
public fun databaseClusterAttributes(initializer: DatabaseClusterAttributes.Builder.() -> Unit =
    {}): DatabaseClusterAttributes = DatabaseClusterAttributes.builder().apply(initializer).build()
