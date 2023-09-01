package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup

@Generated
public fun buildKeyGroupConfigProperty(initializer: @AwsCdkDsl
    CfnKeyGroup.KeyGroupConfigProperty.Builder.() -> Unit = {}): CfnKeyGroup.KeyGroupConfigProperty
    = CfnKeyGroup.KeyGroupConfigProperty.Builder().apply(initializer).build()
