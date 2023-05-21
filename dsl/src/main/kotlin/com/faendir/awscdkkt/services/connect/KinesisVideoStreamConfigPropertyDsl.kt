package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@Generated
public
    fun kinesisVideoStreamConfigProperty(initializer: CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder.() -> Unit
    = {}): CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty =
    CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.builder().apply(initializer).build()
