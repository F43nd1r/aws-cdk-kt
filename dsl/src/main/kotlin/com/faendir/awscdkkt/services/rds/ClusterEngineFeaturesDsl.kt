package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ClusterEngineFeatures

@Generated
public fun clusterEngineFeatures(initializer: ClusterEngineFeatures.Builder.() -> Unit = {}):
    ClusterEngineFeatures = ClusterEngineFeatures.builder().apply(initializer).build()
