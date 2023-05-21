package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun dataSourceProperty(initializer: CfnModelPackage.DataSourceProperty.Builder.() -> Unit =
    {}): CfnModelPackage.DataSourceProperty =
    CfnModelPackage.DataSourceProperty.builder().apply(initializer).build()
