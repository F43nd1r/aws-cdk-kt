package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstanceProps

@Generated
public fun cfnInstanceProps(initializer: CfnInstanceProps.Builder.() -> Unit = {}): CfnInstanceProps
    = CfnInstanceProps.builder().apply(initializer).build()
