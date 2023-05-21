package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public fun s3ParametersProperty(initializer: CfnDataSource.S3ParametersProperty.Builder.() -> Unit =
    {}): CfnDataSource.S3ParametersProperty =
    CfnDataSource.S3ParametersProperty.builder().apply(initializer).build()
