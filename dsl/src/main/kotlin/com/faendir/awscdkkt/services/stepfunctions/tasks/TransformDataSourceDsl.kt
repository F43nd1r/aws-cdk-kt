package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource

@Generated
public fun transformDataSource(initializer: TransformDataSource.Builder.() -> Unit = {}):
    TransformDataSource = TransformDataSource.builder().apply(initializer).build()
