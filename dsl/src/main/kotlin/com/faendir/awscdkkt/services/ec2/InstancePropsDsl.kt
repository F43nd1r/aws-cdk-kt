package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InstanceProps

@Generated
public fun instanceProps(initializer: InstanceProps.Builder.() -> Unit = {}): InstanceProps =
    InstanceProps.builder().apply(initializer).build()
