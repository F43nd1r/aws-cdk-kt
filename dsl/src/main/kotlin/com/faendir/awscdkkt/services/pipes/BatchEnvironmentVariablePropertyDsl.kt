package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun batchEnvironmentVariableProperty(initializer: CfnPipe.BatchEnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnPipe.BatchEnvironmentVariableProperty =
    CfnPipe.BatchEnvironmentVariableProperty.builder().apply(initializer).build()
