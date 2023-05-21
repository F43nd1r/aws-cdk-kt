package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobQueue

@Generated
public
    fun computeEnvironmentOrderProperty(initializer: CfnJobQueue.ComputeEnvironmentOrderProperty.Builder.() -> Unit
    = {}): CfnJobQueue.ComputeEnvironmentOrderProperty =
    CfnJobQueue.ComputeEnvironmentOrderProperty.builder().apply(initializer).build()
