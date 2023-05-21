package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps

@Generated
public
    fun auroraPostgresClusterEngineProps(initializer: AuroraPostgresClusterEngineProps.Builder.() -> Unit
    = {}): AuroraPostgresClusterEngineProps =
    AuroraPostgresClusterEngineProps.builder().apply(initializer).build()
