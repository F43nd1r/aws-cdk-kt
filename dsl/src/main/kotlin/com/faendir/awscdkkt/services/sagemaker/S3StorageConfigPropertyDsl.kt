@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

public
    fun s3StorageConfigProperty(initializer: CfnFeatureGroup.S3StorageConfigProperty.Builder.() -> Unit):
    CfnFeatureGroup.S3StorageConfigProperty =
    CfnFeatureGroup.S3StorageConfigProperty.builder().apply(initializer).build()
