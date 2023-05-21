package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnInstanceProps

@Generated
public fun cfnInstanceProps(initializer: CfnInstanceProps.Builder.() -> Unit = {}): CfnInstanceProps
    = CfnInstanceProps.builder().apply(initializer).build()
