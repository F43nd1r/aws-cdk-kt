package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset

@Generated
public
    fun datasetParameterProperty(initializer: CfnDataset.DatasetParameterProperty.Builder.() -> Unit
    = {}): CfnDataset.DatasetParameterProperty =
    CfnDataset.DatasetParameterProperty.builder().apply(initializer).build()
