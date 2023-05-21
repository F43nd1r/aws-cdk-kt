package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnDatabaseProps

@Generated
public fun cfnDatabaseProps(initializer: CfnDatabaseProps.Builder.() -> Unit = {}): CfnDatabaseProps
    = CfnDatabaseProps.builder().apply(initializer).build()
