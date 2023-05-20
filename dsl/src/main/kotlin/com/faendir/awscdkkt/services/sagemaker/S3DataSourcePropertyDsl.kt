@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun s3DataSourceProperty(initializer: CfnModelPackage.S3DataSourceProperty.Builder.() -> Unit):
    CfnModelPackage.S3DataSourceProperty =
    CfnModelPackage.S3DataSourceProperty.builder().apply(initializer).build()
