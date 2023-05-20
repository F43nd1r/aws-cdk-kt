@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions

public
    fun responseHeadersContentTypeOptions(initializer: ResponseHeadersContentTypeOptions.Builder.() -> Unit):
    ResponseHeadersContentTypeOptions =
    ResponseHeadersContentTypeOptions.builder().apply(initializer).build()
