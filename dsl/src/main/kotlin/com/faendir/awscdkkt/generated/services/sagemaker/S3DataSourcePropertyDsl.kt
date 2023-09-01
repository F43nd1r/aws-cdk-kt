package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun buildS3DataSourceProperty(initializer: @AwsCdkDsl
    CfnModelPackage.S3DataSourceProperty.Builder.() -> Unit = {}):
    CfnModelPackage.S3DataSourceProperty =
    CfnModelPackage.S3DataSourceProperty.Builder().apply(initializer).build()
