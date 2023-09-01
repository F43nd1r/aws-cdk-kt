package com.faendir.awscdkkt.generated.services.transfer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

@Generated
public fun buildS3FileLocationProperty(initializer: @AwsCdkDsl
    CfnWorkflow.S3FileLocationProperty.Builder.() -> Unit = {}): CfnWorkflow.S3FileLocationProperty
    = CfnWorkflow.S3FileLocationProperty.Builder().apply(initializer).build()
