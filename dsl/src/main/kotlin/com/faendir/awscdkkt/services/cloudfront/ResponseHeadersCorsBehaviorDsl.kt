package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior

@Generated
public fun responseHeadersCorsBehavior(initializer: ResponseHeadersCorsBehavior.Builder.() -> Unit =
    {}): ResponseHeadersCorsBehavior =
    ResponseHeadersCorsBehavior.builder().apply(initializer).build()
