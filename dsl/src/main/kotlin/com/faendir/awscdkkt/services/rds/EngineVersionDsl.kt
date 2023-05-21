package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.EngineVersion

@Generated
public fun engineVersion(initializer: EngineVersion.Builder.() -> Unit = {}): EngineVersion =
    EngineVersion.builder().apply(initializer).build()
