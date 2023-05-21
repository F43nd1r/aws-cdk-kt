package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps

@Generated
public fun cfnSecurityGroupIngressProps(initializer: CfnSecurityGroupIngressProps.Builder.() -> Unit
    = {}): CfnSecurityGroupIngressProps =
    CfnSecurityGroupIngressProps.builder().apply(initializer).build()
