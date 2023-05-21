package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun memoryGiBPerVCpuRequestProperty(initializer: CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.MemoryGiBPerVCpuRequestProperty =
    CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.builder().apply(initializer).build()
