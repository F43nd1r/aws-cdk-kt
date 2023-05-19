@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

public
    fun s3ConfigProperty(initializer: CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit):
    CfnInstanceStorageConfig.S3ConfigProperty =
    CfnInstanceStorageConfig.S3ConfigProperty.builder().apply(initializer).build()
