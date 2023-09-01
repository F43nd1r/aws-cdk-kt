package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceAttributes

@Generated
public fun buildDatabaseInstanceAttributes(initializer: @AwsCdkDsl
    DatabaseInstanceAttributes.Builder.() -> Unit = {}): DatabaseInstanceAttributes =
    DatabaseInstanceAttributes.Builder().apply(initializer).build()
