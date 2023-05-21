package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstanceProps

@Generated
public fun cfnInstanceProps(initializer: CfnInstanceProps.Builder.() -> Unit = {}): CfnInstanceProps
    = CfnInstanceProps.builder().apply(initializer).build()
