package com.faendir.awscdkkt.services.ses.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.actions.S3Props

@Generated
public fun s3Props(initializer: S3Props.Builder.() -> Unit = {}): S3Props =
    S3Props.builder().apply(initializer).build()
