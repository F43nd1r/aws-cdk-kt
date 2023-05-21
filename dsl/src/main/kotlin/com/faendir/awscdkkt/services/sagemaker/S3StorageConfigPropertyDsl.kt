package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@Generated
public
    fun s3StorageConfigProperty(initializer: CfnFeatureGroup.S3StorageConfigProperty.Builder.() -> Unit
    = {}): CfnFeatureGroup.S3StorageConfigProperty =
    CfnFeatureGroup.S3StorageConfigProperty.builder().apply(initializer).build()
