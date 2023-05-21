package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun inputFormatOptionsProperty(initializer: CfnTable.InputFormatOptionsProperty.Builder.() -> Unit
    = {}): CfnTable.InputFormatOptionsProperty =
    CfnTable.InputFormatOptionsProperty.builder().apply(initializer).build()
