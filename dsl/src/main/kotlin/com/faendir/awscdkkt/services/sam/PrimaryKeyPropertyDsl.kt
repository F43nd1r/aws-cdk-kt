package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnSimpleTable

@Generated
public fun primaryKeyProperty(initializer: CfnSimpleTable.PrimaryKeyProperty.Builder.() -> Unit =
    {}): CfnSimpleTable.PrimaryKeyProperty =
    CfnSimpleTable.PrimaryKeyProperty.builder().apply(initializer).build()
