package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun s3ContentLocationProperty(initializer: CfnApplication.S3ContentLocationProperty.Builder.() -> Unit
    = {}): CfnApplication.S3ContentLocationProperty =
    CfnApplication.S3ContentLocationProperty.builder().apply(initializer).build()
