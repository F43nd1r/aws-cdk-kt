@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

public
    fun s3LogsProperty(initializer: CfnInfrastructureConfiguration.S3LogsProperty.Builder.() -> Unit):
    CfnInfrastructureConfiguration.S3LogsProperty =
    CfnInfrastructureConfiguration.S3LogsProperty.builder().apply(initializer).build()
