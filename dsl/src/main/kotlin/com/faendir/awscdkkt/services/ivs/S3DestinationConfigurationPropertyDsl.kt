@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

public
    fun s3DestinationConfigurationProperty(initializer: CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder.() -> Unit):
    CfnRecordingConfiguration.S3DestinationConfigurationProperty =
    CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder().apply(initializer).build()
