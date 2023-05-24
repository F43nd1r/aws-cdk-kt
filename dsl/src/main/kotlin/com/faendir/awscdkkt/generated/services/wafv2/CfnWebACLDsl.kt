package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebACL(id: String, props: CfnWebACLProps): CfnWebACL = CfnWebACL(this, id,
    props)

@Generated
public fun Construct.cfnWebACL(
  id: String,
  props: CfnWebACLProps,
  initializer: @AwsCdkDsl CfnWebACL.() -> Unit,
): CfnWebACL = CfnWebACL(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebACL(id: String, initializer: @AwsCdkDsl
    CfnWebACL.Builder.() -> Unit): CfnWebACL = CfnWebACL.Builder.create(this,
    id).apply(initializer).build()
