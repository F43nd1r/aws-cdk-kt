package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun buildCustomResponseBodyProperty(initializer: @AwsCdkDsl
    CfnWebACL.CustomResponseBodyProperty.Builder.() -> Unit = {}):
    CfnWebACL.CustomResponseBodyProperty =
    CfnWebACL.CustomResponseBodyProperty.Builder().apply(initializer).build()
