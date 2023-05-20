@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun strictTransportSecurityProperty(initializer: CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.StrictTransportSecurityProperty =
    CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder().apply(initializer).build()
