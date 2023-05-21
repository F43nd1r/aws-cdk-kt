package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior

@Generated
public
    fun responseSecurityHeadersBehavior(initializer: ResponseSecurityHeadersBehavior.Builder.() -> Unit
    = {}): ResponseSecurityHeadersBehavior =
    ResponseSecurityHeadersBehavior.builder().apply(initializer).build()
