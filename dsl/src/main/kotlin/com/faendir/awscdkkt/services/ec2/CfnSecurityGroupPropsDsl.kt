package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps

@Generated
public fun cfnSecurityGroupProps(initializer: CfnSecurityGroupProps.Builder.() -> Unit = {}):
    CfnSecurityGroupProps = CfnSecurityGroupProps.builder().apply(initializer).build()
