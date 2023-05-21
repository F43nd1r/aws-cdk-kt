package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun ipv6PrefixSpecificationProperty(initializer: CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.Ipv6PrefixSpecificationProperty =
    CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.builder().apply(initializer).build()
