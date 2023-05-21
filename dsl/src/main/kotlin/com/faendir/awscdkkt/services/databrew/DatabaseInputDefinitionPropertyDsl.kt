package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset

@Generated
public
    fun databaseInputDefinitionProperty(initializer: CfnDataset.DatabaseInputDefinitionProperty.Builder.() -> Unit
    = {}): CfnDataset.DatabaseInputDefinitionProperty =
    CfnDataset.DatabaseInputDefinitionProperty.builder().apply(initializer).build()
