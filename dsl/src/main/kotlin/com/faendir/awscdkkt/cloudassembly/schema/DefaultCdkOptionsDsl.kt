package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions

@Generated
public fun defaultCdkOptions(initializer: DefaultCdkOptions.Builder.() -> Unit = {}):
    DefaultCdkOptions = DefaultCdkOptions.builder().apply(initializer).build()
