package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxyAttributes

@Generated
public fun buildDatabaseProxyAttributes(initializer: @AwsCdkDsl
    DatabaseProxyAttributes.Builder.() -> Unit): DatabaseProxyAttributes =
    DatabaseProxyAttributes.Builder().apply(initializer).build()
