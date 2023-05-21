package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceProps

@Generated
public fun databaseInstanceProps(initializer: DatabaseInstanceProps.Builder.() -> Unit = {}):
    DatabaseInstanceProps = DatabaseInstanceProps.builder().apply(initializer).build()
