package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps

@Generated
public fun cfnSecurityGroupEgressProps(initializer: CfnSecurityGroupEgressProps.Builder.() -> Unit =
    {}): CfnSecurityGroupEgressProps =
    CfnSecurityGroupEgressProps.builder().apply(initializer).build()
