package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@Generated
public
    fun computeResourcesProperty(initializer: CfnComputeEnvironment.ComputeResourcesProperty.Builder.() -> Unit
    = {}): CfnComputeEnvironment.ComputeResourcesProperty =
    CfnComputeEnvironment.ComputeResourcesProperty.builder().apply(initializer).build()
