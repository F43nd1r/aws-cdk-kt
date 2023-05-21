package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnSimpleTable

@Generated
public
    fun provisionedThroughputProperty(initializer: CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit
    = {}): CfnSimpleTable.ProvisionedThroughputProperty =
    CfnSimpleTable.ProvisionedThroughputProperty.builder().apply(initializer).build()
