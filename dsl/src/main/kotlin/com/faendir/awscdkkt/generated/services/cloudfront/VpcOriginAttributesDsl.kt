package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.VpcOriginAttributes

@Generated
public fun buildVpcOriginAttributes(initializer: @AwsCdkDsl VpcOriginAttributes.Builder.() -> Unit =
    {}): VpcOriginAttributes = VpcOriginAttributes.Builder().apply(initializer).build()
