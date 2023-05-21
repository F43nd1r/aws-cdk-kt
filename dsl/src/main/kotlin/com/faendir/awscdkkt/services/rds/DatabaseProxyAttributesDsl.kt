package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxyAttributes

@Generated
public fun databaseProxyAttributes(initializer: DatabaseProxyAttributes.Builder.() -> Unit = {}):
    DatabaseProxyAttributes = DatabaseProxyAttributes.builder().apply(initializer).build()
