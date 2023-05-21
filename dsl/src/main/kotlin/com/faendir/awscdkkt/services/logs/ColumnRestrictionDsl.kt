package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.ColumnRestriction

@Generated
public fun columnRestriction(initializer: ColumnRestriction.Builder.() -> Unit = {}):
    ColumnRestriction = ColumnRestriction.builder().apply(initializer).build()
