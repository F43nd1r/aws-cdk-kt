package com.faendir.awscdkkt.services.cloudfront.origins

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.RestApiOriginProps

@Generated
public fun restApiOriginProps(initializer: RestApiOriginProps.Builder.() -> Unit = {}):
    RestApiOriginProps = RestApiOriginProps.builder().apply(initializer).build()
