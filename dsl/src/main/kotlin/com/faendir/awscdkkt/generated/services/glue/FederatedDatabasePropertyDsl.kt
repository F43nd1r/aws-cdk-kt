package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

@Generated
public fun buildFederatedDatabaseProperty(initializer: @AwsCdkDsl
    CfnDatabase.FederatedDatabaseProperty.Builder.() -> Unit = {}):
    CfnDatabase.FederatedDatabaseProperty =
    CfnDatabase.FederatedDatabaseProperty.Builder().apply(initializer).build()
