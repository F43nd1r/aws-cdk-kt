package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.VpcOriginOptions

@Generated
public fun buildVpcOriginOptions(initializer: @AwsCdkDsl VpcOriginOptions.Builder.() -> Unit = {}):
    VpcOriginOptions = VpcOriginOptions.Builder().apply(initializer).build()
