package com.faendir.awscdkkt.generated.services.memorydb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnACL
import software.amazon.awscdk.services.memorydb.CfnACLProps
import software.constructs.Construct

@Generated
public fun Construct.cfnACL(
  id: String,
  props: CfnACLProps,
  initializer: @AwsCdkDsl CfnACL.() -> Unit = {},
): CfnACL = CfnACL(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnACL(id: String, initializer: @AwsCdkDsl CfnACL.Builder.() -> Unit = {}): CfnACL = CfnACL.Builder.create(this, id).apply(initializer).build()
