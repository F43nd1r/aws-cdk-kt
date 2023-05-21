package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet

@Generated
public
    fun logicalTableSourceProperty(initializer: CfnDataSet.LogicalTableSourceProperty.Builder.() -> Unit
    = {}): CfnDataSet.LogicalTableSourceProperty =
    CfnDataSet.LogicalTableSourceProperty.builder().apply(initializer).build()
