package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseClusterProps

@Generated
public fun databaseClusterProps(initializer: DatabaseClusterProps.Builder.() -> Unit = {}):
    DatabaseClusterProps = DatabaseClusterProps.builder().apply(initializer).build()
