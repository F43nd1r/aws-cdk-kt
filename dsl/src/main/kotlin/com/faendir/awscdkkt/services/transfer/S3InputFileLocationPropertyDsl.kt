package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

@Generated
public
    fun s3InputFileLocationProperty(initializer: CfnWorkflow.S3InputFileLocationProperty.Builder.() -> Unit
    = {}): CfnWorkflow.S3InputFileLocationProperty =
    CfnWorkflow.S3InputFileLocationProperty.builder().apply(initializer).build()
