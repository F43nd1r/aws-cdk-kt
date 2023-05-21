package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDatabaseProps

@Generated
public fun cfnDatabaseProps(initializer: CfnDatabaseProps.Builder.() -> Unit = {}): CfnDatabaseProps
    = CfnDatabaseProps.builder().apply(initializer).build()
