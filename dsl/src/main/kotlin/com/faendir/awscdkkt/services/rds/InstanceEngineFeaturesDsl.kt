package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.InstanceEngineFeatures

@Generated
public fun instanceEngineFeatures(initializer: InstanceEngineFeatures.Builder.() -> Unit = {}):
    InstanceEngineFeatures = InstanceEngineFeatures.builder().apply(initializer).build()
