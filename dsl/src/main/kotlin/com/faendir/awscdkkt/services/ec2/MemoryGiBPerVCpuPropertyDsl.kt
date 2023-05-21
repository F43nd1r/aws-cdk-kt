package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun memoryGiBPerVCpuProperty(initializer: CfnLaunchTemplate.MemoryGiBPerVCpuProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.MemoryGiBPerVCpuProperty =
    CfnLaunchTemplate.MemoryGiBPerVCpuProperty.builder().apply(initializer).build()
