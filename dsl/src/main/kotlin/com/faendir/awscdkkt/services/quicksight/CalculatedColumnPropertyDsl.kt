package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet

@Generated
public
    fun calculatedColumnProperty(initializer: CfnDataSet.CalculatedColumnProperty.Builder.() -> Unit
    = {}): CfnDataSet.CalculatedColumnProperty =
    CfnDataSet.CalculatedColumnProperty.builder().apply(initializer).build()
