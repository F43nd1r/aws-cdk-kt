package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ClusterEngineConfig

@Generated
public fun clusterEngineConfig(initializer: ClusterEngineConfig.Builder.() -> Unit = {}):
    ClusterEngineConfig = ClusterEngineConfig.builder().apply(initializer).build()
