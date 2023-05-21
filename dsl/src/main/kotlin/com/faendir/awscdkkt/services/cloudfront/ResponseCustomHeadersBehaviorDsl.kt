package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior

@Generated
public
    fun responseCustomHeadersBehavior(initializer: ResponseCustomHeadersBehavior.Builder.() -> Unit
    = {}): ResponseCustomHeadersBehavior =
    ResponseCustomHeadersBehavior.builder().apply(initializer).build()
