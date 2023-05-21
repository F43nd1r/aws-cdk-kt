package com.faendir.awscdkkt.services.qldb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStream

@Generated
public
    fun kinesisConfigurationProperty(initializer: CfnStream.KinesisConfigurationProperty.Builder.() -> Unit
    = {}): CfnStream.KinesisConfigurationProperty =
    CfnStream.KinesisConfigurationProperty.builder().apply(initializer).build()
