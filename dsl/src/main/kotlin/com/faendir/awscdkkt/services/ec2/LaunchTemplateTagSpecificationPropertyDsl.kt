package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun launchTemplateTagSpecificationProperty(initializer: CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty =
    CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.builder().apply(initializer).build()
