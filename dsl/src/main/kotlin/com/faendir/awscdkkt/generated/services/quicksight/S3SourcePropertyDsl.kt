package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSet

@Generated
public fun buildS3SourceProperty(initializer: @AwsCdkDsl
    CfnDataSet.S3SourceProperty.Builder.() -> Unit = {}): CfnDataSet.S3SourceProperty =
    CfnDataSet.S3SourceProperty.Builder().apply(initializer).build()
