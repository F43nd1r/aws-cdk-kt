package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun snowflakeParametersProperty(initializer: CfnDataSource.SnowflakeParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.SnowflakeParametersProperty =
    CfnDataSource.SnowflakeParametersProperty.builder().apply(initializer).build()
