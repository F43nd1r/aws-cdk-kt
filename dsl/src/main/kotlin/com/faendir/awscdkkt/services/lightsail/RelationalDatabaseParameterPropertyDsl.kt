package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDatabase

@Generated
public
    fun relationalDatabaseParameterProperty(initializer: CfnDatabase.RelationalDatabaseParameterProperty.Builder.() -> Unit
    = {}): CfnDatabase.RelationalDatabaseParameterProperty =
    CfnDatabase.RelationalDatabaseParameterProperty.builder().apply(initializer).build()
