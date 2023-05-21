package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun prestoParametersProperty(initializer: CfnDataSource.PrestoParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.PrestoParametersProperty =
    CfnDataSource.PrestoParametersProperty.builder().apply(initializer).build()
