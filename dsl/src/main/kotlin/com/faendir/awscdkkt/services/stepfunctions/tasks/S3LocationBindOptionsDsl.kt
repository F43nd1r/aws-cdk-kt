package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions

@Generated
public fun s3LocationBindOptions(initializer: S3LocationBindOptions.Builder.() -> Unit = {}):
    S3LocationBindOptions = S3LocationBindOptions.builder().apply(initializer).build()
