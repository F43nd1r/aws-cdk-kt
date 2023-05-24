package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ClusterEngineConfig

@Generated
public fun buildClusterEngineConfig(initializer: @AwsCdkDsl ClusterEngineConfig.Builder.() -> Unit):
    ClusterEngineConfig = ClusterEngineConfig.Builder().apply(initializer).build()
