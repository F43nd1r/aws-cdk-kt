@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

public
    fun eksConfigurationProperty(initializer: CfnComputeEnvironment.EksConfigurationProperty.Builder.() -> Unit):
    CfnComputeEnvironment.EksConfigurationProperty =
    CfnComputeEnvironment.EksConfigurationProperty.builder().apply(initializer).build()
