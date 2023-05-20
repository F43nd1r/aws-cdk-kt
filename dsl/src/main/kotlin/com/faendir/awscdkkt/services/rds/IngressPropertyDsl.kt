@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

public fun ingressProperty(initializer: CfnDBSecurityGroup.IngressProperty.Builder.() -> Unit):
    CfnDBSecurityGroup.IngressProperty =
    CfnDBSecurityGroup.IngressProperty.builder().apply(initializer).build()
