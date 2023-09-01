package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceProps

@Generated
public fun buildDatabaseInstanceProps(initializer: @AwsCdkDsl
    DatabaseInstanceProps.Builder.() -> Unit = {}): DatabaseInstanceProps =
    DatabaseInstanceProps.Builder().apply(initializer).build()
