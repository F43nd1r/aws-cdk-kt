@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

public
    fun kinesisFirehoseConfigProperty(initializer: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder.() -> Unit):
    CfnInstanceStorageConfig.KinesisFirehoseConfigProperty =
    CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder().apply(initializer).build()
