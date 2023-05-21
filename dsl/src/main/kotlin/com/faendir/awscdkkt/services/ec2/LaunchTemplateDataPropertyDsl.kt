package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun launchTemplateDataProperty(initializer: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.LaunchTemplateDataProperty =
    CfnLaunchTemplate.LaunchTemplateDataProperty.builder().apply(initializer).build()
