@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

public fun transformS3DataSource(initializer: TransformS3DataSource.Builder.() -> Unit):
    TransformS3DataSource = TransformS3DataSource.builder().apply(initializer).build()
