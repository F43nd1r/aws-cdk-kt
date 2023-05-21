package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet

@Generated
public
    fun relationalTableProperty(initializer: CfnDataSet.RelationalTableProperty.Builder.() -> Unit =
    {}): CfnDataSet.RelationalTableProperty =
    CfnDataSet.RelationalTableProperty.builder().apply(initializer).build()
