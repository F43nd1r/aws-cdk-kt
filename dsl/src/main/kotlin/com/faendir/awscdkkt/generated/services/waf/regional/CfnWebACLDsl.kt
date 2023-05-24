package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import software.amazon.awscdk.services.waf.regional.CfnWebACLProps
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
