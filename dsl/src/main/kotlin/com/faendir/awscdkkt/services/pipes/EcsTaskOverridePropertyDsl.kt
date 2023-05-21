package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public fun ecsTaskOverrideProperty(initializer: CfnPipe.EcsTaskOverrideProperty.Builder.() -> Unit =
    {}): CfnPipe.EcsTaskOverrideProperty =
    CfnPipe.EcsTaskOverrideProperty.builder().apply(initializer).build()
