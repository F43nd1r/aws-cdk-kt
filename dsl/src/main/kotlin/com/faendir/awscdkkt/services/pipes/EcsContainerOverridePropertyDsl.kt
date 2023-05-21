package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun ecsContainerOverrideProperty(initializer: CfnPipe.EcsContainerOverrideProperty.Builder.() -> Unit
    = {}): CfnPipe.EcsContainerOverrideProperty =
    CfnPipe.EcsContainerOverrideProperty.builder().apply(initializer).build()
