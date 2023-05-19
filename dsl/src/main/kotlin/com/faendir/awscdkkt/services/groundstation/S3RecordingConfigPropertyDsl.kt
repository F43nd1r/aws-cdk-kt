@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig

public
    fun s3RecordingConfigProperty(initializer: CfnConfig.S3RecordingConfigProperty.Builder.() -> Unit):
    CfnConfig.S3RecordingConfigProperty =
    CfnConfig.S3RecordingConfigProperty.builder().apply(initializer).build()
