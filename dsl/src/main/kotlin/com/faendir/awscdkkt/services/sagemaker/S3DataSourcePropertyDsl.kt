@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun s3DataSourceProperty(initializer: CfnModelPackage.S3DataSourceProperty.Builder.() -> Unit):
    CfnModelPackage.S3DataSourceProperty =
    CfnModelPackage.S3DataSourceProperty.builder().apply(initializer).build()
