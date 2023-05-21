package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.InstanceEngineBindOptions

@Generated
public fun instanceEngineBindOptions(initializer: InstanceEngineBindOptions.Builder.() -> Unit =
    {}): InstanceEngineBindOptions = InstanceEngineBindOptions.builder().apply(initializer).build()
