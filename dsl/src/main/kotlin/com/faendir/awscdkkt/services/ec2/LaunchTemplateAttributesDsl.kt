package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplateAttributes

@Generated
public fun launchTemplateAttributes(initializer: LaunchTemplateAttributes.Builder.() -> Unit = {}):
    LaunchTemplateAttributes = LaunchTemplateAttributes.builder().apply(initializer).build()
