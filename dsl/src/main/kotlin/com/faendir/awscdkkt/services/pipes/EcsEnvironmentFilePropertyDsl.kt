package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun ecsEnvironmentFileProperty(initializer: CfnPipe.EcsEnvironmentFileProperty.Builder.() -> Unit
    = {}): CfnPipe.EcsEnvironmentFileProperty =
    CfnPipe.EcsEnvironmentFileProperty.builder().apply(initializer).build()
