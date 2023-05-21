package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun postgreSqlParametersProperty(initializer: CfnDataSource.PostgreSqlParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.PostgreSqlParametersProperty =
    CfnDataSource.PostgreSqlParametersProperty.builder().apply(initializer).build()
