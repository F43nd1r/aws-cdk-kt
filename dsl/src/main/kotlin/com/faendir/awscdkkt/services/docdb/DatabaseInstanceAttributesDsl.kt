package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes

@Generated
public fun databaseInstanceAttributes(initializer: DatabaseInstanceAttributes.Builder.() -> Unit =
    {}): DatabaseInstanceAttributes =
    DatabaseInstanceAttributes.builder().apply(initializer).build()
