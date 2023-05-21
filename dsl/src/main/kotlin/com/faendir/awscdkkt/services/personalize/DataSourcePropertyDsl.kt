package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset

@Generated
public fun dataSourceProperty(initializer: CfnDataset.DataSourceProperty.Builder.() -> Unit = {}):
    CfnDataset.DataSourceProperty =
    CfnDataset.DataSourceProperty.builder().apply(initializer).build()
