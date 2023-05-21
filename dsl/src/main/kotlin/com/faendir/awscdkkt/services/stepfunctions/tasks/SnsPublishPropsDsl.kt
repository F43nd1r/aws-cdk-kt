package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SnsPublishProps

@Generated
public fun snsPublishProps(initializer: SnsPublishProps.Builder.() -> Unit = {}): SnsPublishProps =
    SnsPublishProps.builder().apply(initializer).build()
