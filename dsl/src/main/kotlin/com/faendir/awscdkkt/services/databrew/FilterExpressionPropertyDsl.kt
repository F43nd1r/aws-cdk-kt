package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset

@Generated
public
    fun filterExpressionProperty(initializer: CfnDataset.FilterExpressionProperty.Builder.() -> Unit
    = {}): CfnDataset.FilterExpressionProperty =
    CfnDataset.FilterExpressionProperty.builder().apply(initializer).build()
