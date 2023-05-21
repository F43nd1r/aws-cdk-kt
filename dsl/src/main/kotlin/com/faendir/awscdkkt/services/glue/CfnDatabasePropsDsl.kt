package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabaseProps

@Generated
public fun cfnDatabaseProps(initializer: CfnDatabaseProps.Builder.() -> Unit = {}): CfnDatabaseProps
    = CfnDatabaseProps.builder().apply(initializer).build()
