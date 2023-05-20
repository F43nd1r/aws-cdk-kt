@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.S3DownloadOptions

public fun s3DownloadOptions(initializer: S3DownloadOptions.Builder.() -> Unit): S3DownloadOptions =
    S3DownloadOptions.builder().apply(initializer).build()
