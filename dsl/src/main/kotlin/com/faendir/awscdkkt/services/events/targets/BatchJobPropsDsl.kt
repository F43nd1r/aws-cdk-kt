package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.BatchJobProps

@Generated
public fun batchJobProps(initializer: BatchJobProps.Builder.() -> Unit = {}): BatchJobProps =
    BatchJobProps.builder().apply(initializer).build()
