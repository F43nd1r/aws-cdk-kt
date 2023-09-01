package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.PostgresInstanceEngineProps

@Generated
public fun buildPostgresInstanceEngineProps(initializer: @AwsCdkDsl
    PostgresInstanceEngineProps.Builder.() -> Unit = {}): PostgresInstanceEngineProps =
    PostgresInstanceEngineProps.Builder().apply(initializer).build()
