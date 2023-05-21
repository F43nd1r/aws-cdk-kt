package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CorsRule

@Generated
public fun corsRule(initializer: CorsRule.Builder.() -> Unit = {}): CorsRule =
    CorsRule.builder().apply(initializer).build()
