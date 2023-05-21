package com.faendir.awscdkkt.services.forecast

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset

@Generated
public fun schemaProperty(initializer: CfnDataset.SchemaProperty.Builder.() -> Unit = {}):
    CfnDataset.SchemaProperty = CfnDataset.SchemaProperty.builder().apply(initializer).build()
