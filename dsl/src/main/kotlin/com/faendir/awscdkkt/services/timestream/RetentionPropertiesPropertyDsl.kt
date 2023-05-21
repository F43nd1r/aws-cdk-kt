package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnTable

@Generated
public
    fun retentionPropertiesProperty(initializer: CfnTable.RetentionPropertiesProperty.Builder.() -> Unit
    = {}): CfnTable.RetentionPropertiesProperty =
    CfnTable.RetentionPropertiesProperty.builder().apply(initializer).build()
