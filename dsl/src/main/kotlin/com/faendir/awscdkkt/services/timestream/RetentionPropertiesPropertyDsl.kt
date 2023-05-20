@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnTable

public
    fun retentionPropertiesProperty(initializer: CfnTable.RetentionPropertiesProperty.Builder.() -> Unit):
    CfnTable.RetentionPropertiesProperty =
    CfnTable.RetentionPropertiesProperty.builder().apply(initializer).build()
