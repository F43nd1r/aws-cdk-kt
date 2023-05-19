@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

public
    fun s3FileLocationProperty(initializer: CfnWorkflow.S3FileLocationProperty.Builder.() -> Unit):
    CfnWorkflow.S3FileLocationProperty =
    CfnWorkflow.S3FileLocationProperty.builder().apply(initializer).build()
