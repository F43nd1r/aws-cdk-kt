package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun buildS3ModelDataSourceProperty(initializer: @AwsCdkDsl
    CfnModelPackage.S3ModelDataSourceProperty.Builder.() -> Unit = {}):
    CfnModelPackage.S3ModelDataSourceProperty =
    CfnModelPackage.S3ModelDataSourceProperty.Builder().apply(initializer).build()
