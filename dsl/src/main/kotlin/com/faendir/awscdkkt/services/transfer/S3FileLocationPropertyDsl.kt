@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

public
    fun s3FileLocationProperty(initializer: CfnWorkflow.S3FileLocationProperty.Builder.() -> Unit):
    CfnWorkflow.S3FileLocationProperty =
    CfnWorkflow.S3FileLocationProperty.builder().apply(initializer).build()
