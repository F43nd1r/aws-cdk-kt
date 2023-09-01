package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

@Generated
public fun buildS3ConfigProperty(initializer: @AwsCdkDsl
    CfnInstanceStorageConfig.S3ConfigProperty.Builder.() -> Unit = {}):
    CfnInstanceStorageConfig.S3ConfigProperty =
    CfnInstanceStorageConfig.S3ConfigProperty.Builder().apply(initializer).build()
