package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnStorageConfiguration

@Generated
public fun buildS3StorageConfigurationProperty(initializer: @AwsCdkDsl
    CfnStorageConfiguration.S3StorageConfigurationProperty.Builder.() -> Unit = {}):
    CfnStorageConfiguration.S3StorageConfigurationProperty =
    CfnStorageConfiguration.S3StorageConfigurationProperty.Builder().apply(initializer).build()
