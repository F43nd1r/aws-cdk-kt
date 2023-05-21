package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

@Generated
public fun databaseInputProperty(initializer: CfnDatabase.DatabaseInputProperty.Builder.() -> Unit =
    {}): CfnDatabase.DatabaseInputProperty =
    CfnDatabase.DatabaseInputProperty.builder().apply(initializer).build()
