package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseClusterProps

@Generated
public fun buildDatabaseClusterProps(initializer: @AwsCdkDsl DatabaseClusterProps.Builder.() -> Unit
    = {}): DatabaseClusterProps = DatabaseClusterProps.Builder().apply(initializer).build()
