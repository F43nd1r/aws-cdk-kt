package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun ipv4PrefixSpecificationProperty(initializer: CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.Ipv4PrefixSpecificationProperty =
    CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.builder().apply(initializer).build()
