package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig

@Generated
public fun s3LocationConfig(initializer: S3LocationConfig.Builder.() -> Unit = {}): S3LocationConfig
    = S3LocationConfig.builder().apply(initializer).build()
