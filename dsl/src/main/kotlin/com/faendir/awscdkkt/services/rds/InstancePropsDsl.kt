package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.InstanceProps

@Generated
public fun instanceProps(initializer: InstanceProps.Builder.() -> Unit = {}): InstanceProps =
    InstanceProps.builder().apply(initializer).build()
