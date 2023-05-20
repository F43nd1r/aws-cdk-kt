@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

public
    fun s3StorageConfigProperty(initializer: CfnFeatureGroup.S3StorageConfigProperty.Builder.() -> Unit):
    CfnFeatureGroup.S3StorageConfigProperty =
    CfnFeatureGroup.S3StorageConfigProperty.builder().apply(initializer).build()
