package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

@Generated
public
    fun federatedDatabaseProperty(initializer: CfnDatabase.FederatedDatabaseProperty.Builder.() -> Unit
    = {}): CfnDatabase.FederatedDatabaseProperty =
    CfnDatabase.FederatedDatabaseProperty.builder().apply(initializer).build()
