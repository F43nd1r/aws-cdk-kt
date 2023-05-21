package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps

@Generated
public
    fun sqlServerWebInstanceEngineProps(initializer: SqlServerWebInstanceEngineProps.Builder.() -> Unit
    = {}): SqlServerWebInstanceEngineProps =
    SqlServerWebInstanceEngineProps.builder().apply(initializer).build()
