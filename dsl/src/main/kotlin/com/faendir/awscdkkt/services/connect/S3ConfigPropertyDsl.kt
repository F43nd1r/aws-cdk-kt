package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@Generated
public
    fun s3ConfigProperty(initializer: CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit =
    {}): CfnInstanceStorageConfig.S3ConfigProperty =
    CfnInstanceStorageConfig.S3ConfigProperty.builder().apply(initializer).build()
