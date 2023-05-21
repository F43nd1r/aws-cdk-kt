package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun s3DataSourceProperty(initializer: CfnModelPackage.S3DataSourceProperty.Builder.() -> Unit
    = {}): CfnModelPackage.S3DataSourceProperty =
    CfnModelPackage.S3DataSourceProperty.builder().apply(initializer).build()
