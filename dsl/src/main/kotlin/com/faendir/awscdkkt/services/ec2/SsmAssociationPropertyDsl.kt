@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance

public
    fun ssmAssociationProperty(initializer: CfnInstance.SsmAssociationProperty.Builder.() -> Unit):
    CfnInstance.SsmAssociationProperty =
    CfnInstance.SsmAssociationProperty.builder().apply(initializer).build()
