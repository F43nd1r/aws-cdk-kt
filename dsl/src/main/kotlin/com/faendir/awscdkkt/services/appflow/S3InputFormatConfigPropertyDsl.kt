package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun s3InputFormatConfigProperty(initializer: CfnFlow.S3InputFormatConfigProperty.Builder.() -> Unit
    = {}): CfnFlow.S3InputFormatConfigProperty =
    CfnFlow.S3InputFormatConfigProperty.builder().apply(initializer).build()
