package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.SingleStateOptions

@Generated
public fun singleStateOptions(initializer: SingleStateOptions.Builder.() -> Unit = {}):
    SingleStateOptions = SingleStateOptions.builder().apply(initializer).build()
