package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.Environment

@Generated
public fun environment(initializer: Environment.Builder.() -> Unit = {}): Environment =
    Environment.builder().apply(initializer).build()
