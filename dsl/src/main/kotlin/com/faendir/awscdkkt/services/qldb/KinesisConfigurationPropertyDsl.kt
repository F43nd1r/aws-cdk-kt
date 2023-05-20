@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.qldb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStream

public
    fun kinesisConfigurationProperty(initializer: CfnStream.KinesisConfigurationProperty.Builder.() -> Unit):
    CfnStream.KinesisConfigurationProperty =
    CfnStream.KinesisConfigurationProperty.builder().apply(initializer).build()
