package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.Environment

@Generated
public fun environment(initializer: Environment.Builder.() -> Unit = {}): Environment =
    Environment.builder().apply(initializer).build()
