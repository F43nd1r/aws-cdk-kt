package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceNewProps

@Generated
public fun databaseInstanceNewProps(initializer: DatabaseInstanceNewProps.Builder.() -> Unit = {}):
    DatabaseInstanceNewProps = DatabaseInstanceNewProps.builder().apply(initializer).build()
