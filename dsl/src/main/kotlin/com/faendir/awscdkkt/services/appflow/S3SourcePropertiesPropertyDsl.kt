package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun s3SourcePropertiesProperty(initializer: CfnFlow.S3SourcePropertiesProperty.Builder.() -> Unit
    = {}): CfnFlow.S3SourcePropertiesProperty =
    CfnFlow.S3SourcePropertiesProperty.builder().apply(initializer).build()
