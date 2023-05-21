package com.faendir.awscdkkt.services.cloudfront.origins

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps

@Generated
public fun httpOriginProps(initializer: HttpOriginProps.Builder.() -> Unit = {}): HttpOriginProps =
    HttpOriginProps.builder().apply(initializer).build()
