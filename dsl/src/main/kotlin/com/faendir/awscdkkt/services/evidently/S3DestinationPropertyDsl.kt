package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnProject

@Generated
public fun s3DestinationProperty(initializer: CfnProject.S3DestinationProperty.Builder.() -> Unit =
    {}): CfnProject.S3DestinationProperty =
    CfnProject.S3DestinationProperty.builder().apply(initializer).build()
