package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun importSourceSpecificationProperty(initializer: CfnTable.ImportSourceSpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.ImportSourceSpecificationProperty =
    CfnTable.ImportSourceSpecificationProperty.builder().apply(initializer).build()
