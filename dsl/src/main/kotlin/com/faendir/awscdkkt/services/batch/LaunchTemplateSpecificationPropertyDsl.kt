package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@Generated
public
    fun launchTemplateSpecificationProperty(initializer: CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder.() -> Unit
    = {}): CfnComputeEnvironment.LaunchTemplateSpecificationProperty =
    CfnComputeEnvironment.LaunchTemplateSpecificationProperty.builder().apply(initializer).build()
