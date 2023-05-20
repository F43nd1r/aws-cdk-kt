@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

public
    fun s3OutputFormatConfigProperty(initializer: CfnFlow.S3OutputFormatConfigProperty.Builder.() -> Unit):
    CfnFlow.S3OutputFormatConfigProperty =
    CfnFlow.S3OutputFormatConfigProperty.builder().apply(initializer).build()
