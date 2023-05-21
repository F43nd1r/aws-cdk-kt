package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun ecsEnvironmentVariableProperty(initializer: CfnPipe.EcsEnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnPipe.EcsEnvironmentVariableProperty =
    CfnPipe.EcsEnvironmentVariableProperty.builder().apply(initializer).build()
