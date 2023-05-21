package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun vCpuCountProperty(initializer: CfnLaunchTemplate.VCpuCountProperty.Builder.() -> Unit =
    {}): CfnLaunchTemplate.VCpuCountProperty =
    CfnLaunchTemplate.VCpuCountProperty.builder().apply(initializer).build()
