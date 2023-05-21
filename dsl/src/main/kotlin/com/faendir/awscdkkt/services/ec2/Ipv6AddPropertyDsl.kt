package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun ipv6AddProperty(initializer: CfnLaunchTemplate.Ipv6AddProperty.Builder.() -> Unit = {}):
    CfnLaunchTemplate.Ipv6AddProperty =
    CfnLaunchTemplate.Ipv6AddProperty.builder().apply(initializer).build()
