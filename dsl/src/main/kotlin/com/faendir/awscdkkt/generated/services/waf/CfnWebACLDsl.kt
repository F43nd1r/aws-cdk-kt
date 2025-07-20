package com.faendir.awscdkkt.generated.services.waf

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebACL(
  id: String,
  props: CfnWebACLProps,
  initializer: @AwsCdkDsl CfnWebACL.() -> Unit = {},
): CfnWebACL = CfnWebACL(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebACL(id: String, initializer: @AwsCdkDsl CfnWebACL.Builder.() -> Unit = {}): CfnWebACL = CfnWebACL.Builder.create(this, id).apply(initializer).build()
