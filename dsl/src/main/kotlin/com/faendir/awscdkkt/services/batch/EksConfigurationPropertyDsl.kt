package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@Generated
public
    fun eksConfigurationProperty(initializer: CfnComputeEnvironment.EksConfigurationProperty.Builder.() -> Unit
    = {}): CfnComputeEnvironment.EksConfigurationProperty =
    CfnComputeEnvironment.EksConfigurationProperty.builder().apply(initializer).build()
