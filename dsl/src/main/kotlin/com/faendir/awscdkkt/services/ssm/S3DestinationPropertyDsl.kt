package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

@Generated
public
    fun s3DestinationProperty(initializer: CfnResourceDataSync.S3DestinationProperty.Builder.() -> Unit
    = {}): CfnResourceDataSync.S3DestinationProperty =
    CfnResourceDataSync.S3DestinationProperty.builder().apply(initializer).build()
