@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig

public
    fun s3RecordingConfigProperty(initializer: CfnConfig.S3RecordingConfigProperty.Builder.() -> Unit):
    CfnConfig.S3RecordingConfigProperty =
    CfnConfig.S3RecordingConfigProperty.builder().apply(initializer).build()
