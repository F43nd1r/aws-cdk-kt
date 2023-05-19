@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ErrorResponse

public fun errorResponse(initializer: ErrorResponse.Builder.() -> Unit): ErrorResponse =
    ErrorResponse.builder().apply(initializer).build()
