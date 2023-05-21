package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.LustreConfiguration

@Generated
public fun lustreConfiguration(initializer: LustreConfiguration.Builder.() -> Unit = {}):
    LustreConfiguration = LustreConfiguration.builder().apply(initializer).build()
