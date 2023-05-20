@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

public
    fun s3InputFileLocationProperty(initializer: CfnWorkflow.S3InputFileLocationProperty.Builder.() -> Unit):
    CfnWorkflow.S3InputFileLocationProperty =
    CfnWorkflow.S3InputFileLocationProperty.builder().apply(initializer).build()
