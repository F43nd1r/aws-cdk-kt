package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun s3DestinationPropertiesProperty(initializer: CfnFlow.S3DestinationPropertiesProperty.Builder.() -> Unit
    = {}): CfnFlow.S3DestinationPropertiesProperty =
    CfnFlow.S3DestinationPropertiesProperty.builder().apply(initializer).build()
