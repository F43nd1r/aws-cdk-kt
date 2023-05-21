package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource

@Generated
public fun s3DataSource(initializer: S3DataSource.Builder.() -> Unit = {}): S3DataSource =
    S3DataSource.builder().apply(initializer).build()
