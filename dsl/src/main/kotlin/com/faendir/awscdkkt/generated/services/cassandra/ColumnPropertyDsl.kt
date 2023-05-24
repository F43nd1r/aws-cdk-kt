package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public fun buildColumnProperty(initializer: @AwsCdkDsl CfnTable.ColumnProperty.Builder.() -> Unit):
    CfnTable.ColumnProperty = CfnTable.ColumnProperty.Builder().apply(initializer).build()
