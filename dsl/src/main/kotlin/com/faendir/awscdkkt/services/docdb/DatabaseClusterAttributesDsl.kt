package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseClusterAttributes

@Generated
public fun databaseClusterAttributes(initializer: DatabaseClusterAttributes.Builder.() -> Unit =
    {}): DatabaseClusterAttributes = DatabaseClusterAttributes.builder().apply(initializer).build()
