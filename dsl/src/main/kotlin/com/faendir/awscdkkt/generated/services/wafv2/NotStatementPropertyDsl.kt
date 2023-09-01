package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun buildNotStatementProperty(initializer: @AwsCdkDsl
    CfnWebACL.NotStatementProperty.Builder.() -> Unit = {}): CfnWebACL.NotStatementProperty =
    CfnWebACL.NotStatementProperty.Builder().apply(initializer).build()
