package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun csvProperty(initializer: CfnTable.CsvProperty.Builder.() -> Unit = {}):
    CfnTable.CsvProperty = CfnTable.CsvProperty.builder().apply(initializer).build()
