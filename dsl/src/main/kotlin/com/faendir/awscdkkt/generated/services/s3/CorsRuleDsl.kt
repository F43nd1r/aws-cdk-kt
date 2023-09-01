package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CorsRule

@Generated
public fun buildCorsRule(initializer: @AwsCdkDsl CorsRule.Builder.() -> Unit = {}): CorsRule =
    CorsRule.Builder().apply(initializer).build()
