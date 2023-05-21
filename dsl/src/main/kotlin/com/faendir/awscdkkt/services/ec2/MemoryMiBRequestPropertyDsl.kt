package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun memoryMiBRequestProperty(initializer: CfnSpotFleet.MemoryMiBRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.MemoryMiBRequestProperty =
    CfnSpotFleet.MemoryMiBRequestProperty.builder().apply(initializer).build()
