package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@Generated
public
    fun kinesisStreamConfigProperty(initializer: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder.() -> Unit
    = {}): CfnInstanceStorageConfig.KinesisStreamConfigProperty =
    CfnInstanceStorageConfig.KinesisStreamConfigProperty.builder().apply(initializer).build()
