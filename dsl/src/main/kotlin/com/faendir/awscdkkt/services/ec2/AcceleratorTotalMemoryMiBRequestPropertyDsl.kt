package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun acceleratorTotalMemoryMiBRequestProperty(initializer: CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty =
    CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.builder().apply(initializer).build()
