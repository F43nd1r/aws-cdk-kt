package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.S3DownloadOptions

@Generated
public fun s3DownloadOptions(initializer: S3DownloadOptions.Builder.() -> Unit = {}):
    S3DownloadOptions = S3DownloadOptions.builder().apply(initializer).build()
