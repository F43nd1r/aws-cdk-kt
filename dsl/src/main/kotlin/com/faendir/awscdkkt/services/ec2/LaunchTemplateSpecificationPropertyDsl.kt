@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance

public
    fun launchTemplateSpecificationProperty(initializer: CfnInstance.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
    CfnInstance.LaunchTemplateSpecificationProperty =
    CfnInstance.LaunchTemplateSpecificationProperty.builder().apply(initializer).build()
