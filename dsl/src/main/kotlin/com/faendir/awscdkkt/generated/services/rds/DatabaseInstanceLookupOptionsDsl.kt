package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions

@Generated
public fun buildDatabaseInstanceLookupOptions(initializer: @AwsCdkDsl
    DatabaseInstanceLookupOptions.Builder.() -> Unit = {}): DatabaseInstanceLookupOptions =
    DatabaseInstanceLookupOptions.Builder().apply(initializer).build()
