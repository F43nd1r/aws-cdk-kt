package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTable

@Generated
public fun columnProperty(initializer: CfnTable.ColumnProperty.Builder.() -> Unit = {}):
    CfnTable.ColumnProperty = CfnTable.ColumnProperty.builder().apply(initializer).build()
