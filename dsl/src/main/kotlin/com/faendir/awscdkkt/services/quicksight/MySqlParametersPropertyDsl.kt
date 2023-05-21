package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun mySqlParametersProperty(initializer: CfnDataSource.MySqlParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.MySqlParametersProperty =
    CfnDataSource.MySqlParametersProperty.builder().apply(initializer).build()
