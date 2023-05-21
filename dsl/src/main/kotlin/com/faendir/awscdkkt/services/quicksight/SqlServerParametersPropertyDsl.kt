package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun sqlServerParametersProperty(initializer: CfnDataSource.SqlServerParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.SqlServerParametersProperty =
    CfnDataSource.SqlServerParametersProperty.builder().apply(initializer).build()
