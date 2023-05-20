@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ErrorResponse

public fun errorResponse(initializer: ErrorResponse.Builder.() -> Unit): ErrorResponse =
    ErrorResponse.builder().apply(initializer).build()
