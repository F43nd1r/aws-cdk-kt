package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun memoryMiBProperty(initializer: CfnLaunchTemplate.MemoryMiBProperty.Builder.() -> Unit =
    {}): CfnLaunchTemplate.MemoryMiBProperty =
    CfnLaunchTemplate.MemoryMiBProperty.builder().apply(initializer).build()
