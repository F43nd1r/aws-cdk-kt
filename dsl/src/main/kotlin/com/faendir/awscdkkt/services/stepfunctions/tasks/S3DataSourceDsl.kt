@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource

public fun s3DataSource(initializer: S3DataSource.Builder.() -> Unit): S3DataSource =
    S3DataSource.builder().apply(initializer).build()
