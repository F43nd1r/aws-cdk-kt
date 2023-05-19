@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

public
    fun launchTemplateDataProperty(initializer: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder.() -> Unit):
    CfnLaunchTemplate.LaunchTemplateDataProperty =
    CfnLaunchTemplate.LaunchTemplateDataProperty.builder().apply(initializer).build()
