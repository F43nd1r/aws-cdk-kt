package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NatInstanceProps

@Generated
public fun natInstanceProps(initializer: NatInstanceProps.Builder.() -> Unit = {}): NatInstanceProps
    = NatInstanceProps.builder().apply(initializer).build()
