package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun instanceMarketOptionsProperty(initializer: CfnLaunchTemplate.InstanceMarketOptionsProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.InstanceMarketOptionsProperty =
    CfnLaunchTemplate.InstanceMarketOptionsProperty.builder().apply(initializer).build()
