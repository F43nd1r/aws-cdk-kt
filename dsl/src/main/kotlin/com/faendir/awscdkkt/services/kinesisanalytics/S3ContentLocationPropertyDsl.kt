package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun s3ContentLocationProperty(initializer: CfnApplicationV2.S3ContentLocationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.S3ContentLocationProperty =
    CfnApplicationV2.S3ContentLocationProperty.builder().apply(initializer).build()
