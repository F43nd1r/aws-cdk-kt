package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

@Generated
public fun ingressProperty(initializer: CfnDBSecurityGroup.IngressProperty.Builder.() -> Unit = {}):
    CfnDBSecurityGroup.IngressProperty =
    CfnDBSecurityGroup.IngressProperty.builder().apply(initializer).build()
