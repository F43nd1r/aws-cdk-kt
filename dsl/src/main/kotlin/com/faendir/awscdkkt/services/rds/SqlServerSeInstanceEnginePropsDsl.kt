package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps

@Generated
public
    fun sqlServerSeInstanceEngineProps(initializer: SqlServerSeInstanceEngineProps.Builder.() -> Unit
    = {}): SqlServerSeInstanceEngineProps =
    SqlServerSeInstanceEngineProps.builder().apply(initializer).build()
