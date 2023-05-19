@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

public
    fun s3OutputFormatConfigProperty(initializer: CfnFlow.S3OutputFormatConfigProperty.Builder.() -> Unit):
    CfnFlow.S3OutputFormatConfigProperty =
    CfnFlow.S3OutputFormatConfigProperty.builder().apply(initializer).build()
