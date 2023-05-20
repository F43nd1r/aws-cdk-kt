@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.S3DownloadOptions

public fun s3DownloadOptions(initializer: S3DownloadOptions.Builder.() -> Unit): S3DownloadOptions =
    S3DownloadOptions.builder().apply(initializer).build()
