package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnTable

@Generated
public fun s3ConfigurationProperty(initializer: CfnTable.S3ConfigurationProperty.Builder.() -> Unit
    = {}): CfnTable.S3ConfigurationProperty =
    CfnTable.S3ConfigurationProperty.builder().apply(initializer).build()
