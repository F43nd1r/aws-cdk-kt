package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxyOptions

@Generated
public fun buildDatabaseProxyOptions(initializer: @AwsCdkDsl DatabaseProxyOptions.Builder.() -> Unit
    = {}): DatabaseProxyOptions = DatabaseProxyOptions.Builder().apply(initializer).build()
