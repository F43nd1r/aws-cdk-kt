package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.FindStateOptions

@Generated
public fun findStateOptions(initializer: FindStateOptions.Builder.() -> Unit = {}): FindStateOptions
    = FindStateOptions.builder().apply(initializer).build()
