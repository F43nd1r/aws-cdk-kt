package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps

@Generated
public
    fun sqlServerEeInstanceEngineProps(initializer: SqlServerEeInstanceEngineProps.Builder.() -> Unit
    = {}): SqlServerEeInstanceEngineProps =
    SqlServerEeInstanceEngineProps.builder().apply(initializer).build()
