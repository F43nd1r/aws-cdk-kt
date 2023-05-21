package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun sparkParametersProperty(initializer: CfnDataSource.SparkParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.SparkParametersProperty =
    CfnDataSource.SparkParametersProperty.builder().apply(initializer).build()
