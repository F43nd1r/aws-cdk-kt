package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

@Generated
public fun transformS3DataSource(initializer: TransformS3DataSource.Builder.() -> Unit = {}):
    TransformS3DataSource = TransformS3DataSource.builder().apply(initializer).build()
