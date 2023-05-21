package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset

@Generated
public fun csvOptionsProperty(initializer: CfnDataset.CsvOptionsProperty.Builder.() -> Unit = {}):
    CfnDataset.CsvOptionsProperty =
    CfnDataset.CsvOptionsProperty.builder().apply(initializer).build()
