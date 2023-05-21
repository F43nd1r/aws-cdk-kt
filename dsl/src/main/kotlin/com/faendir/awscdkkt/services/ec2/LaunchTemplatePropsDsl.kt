package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplateProps

@Generated
public fun launchTemplateProps(initializer: LaunchTemplateProps.Builder.() -> Unit = {}):
    LaunchTemplateProps = LaunchTemplateProps.builder().apply(initializer).build()
