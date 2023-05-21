package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.LaunchTemplateSpec

@Generated
public fun launchTemplateSpec(initializer: LaunchTemplateSpec.Builder.() -> Unit = {}):
    LaunchTemplateSpec = LaunchTemplateSpec.builder().apply(initializer).build()
