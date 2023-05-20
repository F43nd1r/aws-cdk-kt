@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

public
    fun kinesisStreamConfigProperty(initializer: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder.() -> Unit):
    CfnInstanceStorageConfig.KinesisStreamConfigProperty =
    CfnInstanceStorageConfig.KinesisStreamConfigProperty.builder().apply(initializer).build()
