@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroup

public fun egressProperty(initializer: CfnSecurityGroup.EgressProperty.Builder.() -> Unit):
    CfnSecurityGroup.EgressProperty =
    CfnSecurityGroup.EgressProperty.builder().apply(initializer).build()
