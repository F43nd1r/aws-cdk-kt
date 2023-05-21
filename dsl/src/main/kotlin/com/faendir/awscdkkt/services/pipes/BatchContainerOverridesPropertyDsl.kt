package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun batchContainerOverridesProperty(initializer: CfnPipe.BatchContainerOverridesProperty.Builder.() -> Unit
    = {}): CfnPipe.BatchContainerOverridesProperty =
    CfnPipe.BatchContainerOverridesProperty.builder().apply(initializer).build()
