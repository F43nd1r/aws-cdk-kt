package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun buildStatementProperty(initializer: @AwsCdkDsl
    CfnWebACL.StatementProperty.Builder.() -> Unit = {}): CfnWebACL.StatementProperty =
    CfnWebACL.StatementProperty.Builder().apply(initializer).build()
