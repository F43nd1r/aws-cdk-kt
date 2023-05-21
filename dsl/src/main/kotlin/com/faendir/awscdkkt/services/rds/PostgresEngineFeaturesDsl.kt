package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.PostgresEngineFeatures

@Generated
public fun postgresEngineFeatures(initializer: PostgresEngineFeatures.Builder.() -> Unit = {}):
    PostgresEngineFeatures = PostgresEngineFeatures.builder().apply(initializer).build()
