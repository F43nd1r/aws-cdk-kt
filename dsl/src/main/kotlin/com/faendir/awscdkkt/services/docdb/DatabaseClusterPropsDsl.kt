package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseClusterProps

@Generated
public fun databaseClusterProps(initializer: DatabaseClusterProps.Builder.() -> Unit = {}):
    DatabaseClusterProps = DatabaseClusterProps.builder().apply(initializer).build()
