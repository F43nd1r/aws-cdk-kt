package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroup

@Generated
public fun egressProperty(initializer: CfnSecurityGroup.EgressProperty.Builder.() -> Unit = {}):
    CfnSecurityGroup.EgressProperty =
    CfnSecurityGroup.EgressProperty.builder().apply(initializer).build()
