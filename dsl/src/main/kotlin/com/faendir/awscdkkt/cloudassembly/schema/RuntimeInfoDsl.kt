package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.RuntimeInfo

@Generated
public fun runtimeInfo(initializer: RuntimeInfo.Builder.() -> Unit = {}): RuntimeInfo =
    RuntimeInfo.builder().apply(initializer).build()
