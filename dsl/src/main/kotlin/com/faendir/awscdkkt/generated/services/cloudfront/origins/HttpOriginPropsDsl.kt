package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps

@Generated
public fun buildHttpOriginProps(initializer: @AwsCdkDsl HttpOriginProps.Builder.() -> Unit):
    HttpOriginProps = HttpOriginProps.Builder().apply(initializer).build()
