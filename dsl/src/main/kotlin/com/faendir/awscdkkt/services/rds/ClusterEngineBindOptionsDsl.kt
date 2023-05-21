package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ClusterEngineBindOptions

@Generated
public fun clusterEngineBindOptions(initializer: ClusterEngineBindOptions.Builder.() -> Unit = {}):
    ClusterEngineBindOptions = ClusterEngineBindOptions.builder().apply(initializer).build()
