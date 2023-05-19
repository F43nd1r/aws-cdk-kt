@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

public
    fun instanceRequirementsProperty(initializer: CfnLaunchTemplate.InstanceRequirementsProperty.Builder.() -> Unit):
    CfnLaunchTemplate.InstanceRequirementsProperty =
    CfnLaunchTemplate.InstanceRequirementsProperty.builder().apply(initializer).build()
