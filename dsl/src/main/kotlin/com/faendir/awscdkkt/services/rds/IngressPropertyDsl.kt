@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

public fun ingressProperty(initializer: CfnDBSecurityGroup.IngressProperty.Builder.() -> Unit):
    CfnDBSecurityGroup.IngressProperty =
    CfnDBSecurityGroup.IngressProperty.builder().apply(initializer).build()
