package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

@Generated
public fun buildTransformS3DataSource(initializer: @AwsCdkDsl
    TransformS3DataSource.Builder.() -> Unit = {}): TransformS3DataSource =
    TransformS3DataSource.Builder().apply(initializer).build()
