package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public fun columnProperty(initializer: CfnTable.ColumnProperty.Builder.() -> Unit = {}):
    CfnTable.ColumnProperty = CfnTable.ColumnProperty.builder().apply(initializer).build()
