@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWorkflow

public
    fun s3InputFileLocationProperty(initializer: CfnWorkflow.S3InputFileLocationProperty.Builder.() -> Unit):
    CfnWorkflow.S3InputFileLocationProperty =
    CfnWorkflow.S3InputFileLocationProperty.builder().apply(initializer).build()
