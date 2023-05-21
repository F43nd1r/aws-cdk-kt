package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun dataSourceParametersProperty(initializer: CfnDataSource.DataSourceParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.DataSourceParametersProperty =
    CfnDataSource.DataSourceParametersProperty.builder().apply(initializer).build()
