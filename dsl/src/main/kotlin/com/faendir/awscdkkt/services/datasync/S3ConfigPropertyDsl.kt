package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationS3

@Generated
public fun s3ConfigProperty(initializer: CfnLocationS3.S3ConfigProperty.Builder.() -> Unit = {}):
    CfnLocationS3.S3ConfigProperty =
    CfnLocationS3.S3ConfigProperty.builder().apply(initializer).build()
