package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnSimpleTable

@Generated
public
    fun sSESpecificationProperty(initializer: CfnSimpleTable.SSESpecificationProperty.Builder.() -> Unit
    = {}): CfnSimpleTable.SSESpecificationProperty =
    CfnSimpleTable.SSESpecificationProperty.builder().apply(initializer).build()
