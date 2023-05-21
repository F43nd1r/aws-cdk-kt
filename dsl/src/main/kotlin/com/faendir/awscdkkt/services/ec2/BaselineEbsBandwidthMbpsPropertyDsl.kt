package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun baselineEbsBandwidthMbpsProperty(initializer: CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty =
    CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.builder().apply(initializer).build()
