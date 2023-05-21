package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides

@Generated
public fun launchTemplateOverrides(initializer: LaunchTemplateOverrides.Builder.() -> Unit = {}):
    LaunchTemplateOverrides = LaunchTemplateOverrides.builder().apply(initializer).build()
