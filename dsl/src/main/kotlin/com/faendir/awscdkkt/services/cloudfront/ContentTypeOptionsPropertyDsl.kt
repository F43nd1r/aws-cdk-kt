package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun contentTypeOptionsProperty(initializer: CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.ContentTypeOptionsProperty =
    CfnResponseHeadersPolicy.ContentTypeOptionsProperty.builder().apply(initializer).build()
