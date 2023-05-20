@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroup

public fun ingressProperty(initializer: CfnSecurityGroup.IngressProperty.Builder.() -> Unit):
    CfnSecurityGroup.IngressProperty =
    CfnSecurityGroup.IngressProperty.builder().apply(initializer).build()
