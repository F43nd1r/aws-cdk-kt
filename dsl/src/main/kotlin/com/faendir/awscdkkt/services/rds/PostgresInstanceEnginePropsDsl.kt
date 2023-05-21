package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.PostgresInstanceEngineProps

@Generated
public fun postgresInstanceEngineProps(initializer: PostgresInstanceEngineProps.Builder.() -> Unit =
    {}): PostgresInstanceEngineProps =
    PostgresInstanceEngineProps.builder().apply(initializer).build()
