package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps

@Generated
public
    fun sqlServerExInstanceEngineProps(initializer: SqlServerExInstanceEngineProps.Builder.() -> Unit
    = {}): SqlServerExInstanceEngineProps =
    SqlServerExInstanceEngineProps.builder().apply(initializer).build()
