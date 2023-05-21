package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.RoleOptions

@Generated
public fun roleOptions(initializer: RoleOptions.Builder.() -> Unit = {}): RoleOptions =
    RoleOptions.builder().apply(initializer).build()
