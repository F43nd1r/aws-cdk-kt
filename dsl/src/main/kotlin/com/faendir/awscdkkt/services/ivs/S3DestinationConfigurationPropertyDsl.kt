@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

public
    fun s3DestinationConfigurationProperty(initializer: CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder.() -> Unit):
    CfnRecordingConfiguration.S3DestinationConfigurationProperty =
    CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder().apply(initializer).build()
