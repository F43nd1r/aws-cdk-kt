@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun strictTransportSecurityProperty(initializer: CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.StrictTransportSecurityProperty =
    CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder().apply(initializer).build()
