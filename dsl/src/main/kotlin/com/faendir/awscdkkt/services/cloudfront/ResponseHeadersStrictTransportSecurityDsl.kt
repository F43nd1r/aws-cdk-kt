@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity

public
    fun responseHeadersStrictTransportSecurity(initializer: ResponseHeadersStrictTransportSecurity.Builder.() -> Unit):
    ResponseHeadersStrictTransportSecurity =
    ResponseHeadersStrictTransportSecurity.builder().apply(initializer).build()
