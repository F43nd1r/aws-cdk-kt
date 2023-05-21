package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@Generated
public
    fun kinesisFirehoseConfigProperty(initializer: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder.() -> Unit
    = {}): CfnInstanceStorageConfig.KinesisFirehoseConfigProperty =
    CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder().apply(initializer).build()
