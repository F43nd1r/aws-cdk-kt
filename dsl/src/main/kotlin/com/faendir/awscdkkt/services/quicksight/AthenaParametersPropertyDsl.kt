package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun athenaParametersProperty(initializer: CfnDataSource.AthenaParametersProperty.Builder.() -> Unit
    = {}): CfnDataSource.AthenaParametersProperty =
    CfnDataSource.AthenaParametersProperty.builder().apply(initializer).build()
