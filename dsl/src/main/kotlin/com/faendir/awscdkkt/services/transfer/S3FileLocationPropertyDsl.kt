package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

@Generated
public fun s3FileLocationProperty(initializer: CfnWorkflow.S3FileLocationProperty.Builder.() -> Unit
    = {}): CfnWorkflow.S3FileLocationProperty =
    CfnWorkflow.S3FileLocationProperty.builder().apply(initializer).build()
