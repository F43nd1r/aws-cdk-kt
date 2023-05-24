package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseClusterAttributes

@Generated
public fun buildDatabaseClusterAttributes(initializer: @AwsCdkDsl
    DatabaseClusterAttributes.Builder.() -> Unit): DatabaseClusterAttributes =
    DatabaseClusterAttributes.Builder().apply(initializer).build()
