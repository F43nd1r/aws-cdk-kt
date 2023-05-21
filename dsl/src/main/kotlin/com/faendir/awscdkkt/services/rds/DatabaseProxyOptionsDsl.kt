package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxyOptions

@Generated
public fun databaseProxyOptions(initializer: DatabaseProxyOptions.Builder.() -> Unit = {}):
    DatabaseProxyOptions = DatabaseProxyOptions.builder().apply(initializer).build()
