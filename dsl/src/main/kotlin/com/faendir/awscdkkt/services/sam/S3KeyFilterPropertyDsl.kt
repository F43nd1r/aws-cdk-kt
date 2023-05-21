package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun s3KeyFilterProperty(initializer: CfnFunction.S3KeyFilterProperty.Builder.() -> Unit =
    {}): CfnFunction.S3KeyFilterProperty =
    CfnFunction.S3KeyFilterProperty.builder().apply(initializer).build()
