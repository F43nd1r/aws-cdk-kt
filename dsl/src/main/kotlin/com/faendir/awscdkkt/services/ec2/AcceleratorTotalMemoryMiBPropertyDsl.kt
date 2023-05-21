package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun acceleratorTotalMemoryMiBProperty(initializer: CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty =
    CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty.builder().apply(initializer).build()
