package com.faendir.awscdkkt.generated.cloudassembly.schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.Hooks

@Generated
public fun buildHooks(initializer: @AwsCdkDsl Hooks.Builder.() -> Unit = {}): Hooks =
    Hooks.Builder().apply(initializer).build()
