package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.ParallelProps

@Generated
public fun parallelProps(initializer: ParallelProps.Builder.() -> Unit = {}): ParallelProps =
    ParallelProps.builder().apply(initializer).build()
