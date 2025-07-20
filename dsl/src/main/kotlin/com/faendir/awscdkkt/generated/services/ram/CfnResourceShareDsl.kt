package com.faendir.awscdkkt.generated.services.ram

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ram.CfnResourceShare
import software.amazon.awscdk.services.ram.CfnResourceShareProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceShare(
  id: String,
  props: CfnResourceShareProps,
  initializer: @AwsCdkDsl CfnResourceShare.() -> Unit = {},
): CfnResourceShare = CfnResourceShare(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceShare(id: String, initializer: @AwsCdkDsl CfnResourceShare.Builder.() -> Unit = {}): CfnResourceShare = CfnResourceShare.Builder.create(this, id).apply(initializer).build()
