@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun batchEnvironmentVariableProperty(initializer: CfnPipe.BatchEnvironmentVariableProperty.Builder.() -> Unit):
    CfnPipe.BatchEnvironmentVariableProperty =
    CfnPipe.BatchEnvironmentVariableProperty.builder().apply(initializer).build()
